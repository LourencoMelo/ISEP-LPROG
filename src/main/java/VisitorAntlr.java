import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Scanner;

public class VisitorAntlr extends SprintCSEMLAPR4BaseVisitor<String> {

    @Override
    public String visitInicio(SprintCSEMLAPR4Parser.InicioContext ctx) {
        return visitChildren(ctx);
    } //FUNCIONAL 100%

    //esta variavel deve ser alterada conforme o computador em uso
    private static final String caminhoParaFicheiros = "src\\main\\java\\Ficheiros\\";

    private static final String caminhoParaImages = "src\\main\\java\\images\\";

    private static final String from = "lprog2021sprintd2de@gmail.com";

    private static final String signInMail = "lprog2021";

    /*
    Métodos pedidos como exemplo na mensagem no moodle de lapr
     */

    @Override
    public String visitMetodoInformaAusenciaFutura(SprintCSEMLAPR4Parser.MetodoInformaAusenciaFuturaContext ctx) {
        try {
            SimpleDateFormat formmater1 = new SimpleDateFormat("dd:MM:yyyy");

            String data1 = ctx.diaEntrada.getText() + ":" + ctx.mesEntrada.getText() + ":" + ctx.anoEntrada.getText();
            String data2 = ctx.diaSaida.getText() + ":" + ctx.mesSaida.getText() + ":" + ctx.anoSaida.getText();

            if (ctx.tipoAusencia.getText().equalsIgnoreCase("Ferias") || ctx.tipoAusencia.getText().equalsIgnoreCase("Justificada") || ctx.tipoAusencia.getText().equalsIgnoreCase("Nao justificada")) {

                if ((Integer.parseInt(ctx.diaEntrada.getText()) > 0 && Integer.parseInt(ctx.diaEntrada.getText()) < 32) && (Integer.parseInt(ctx.mesEntrada.getText()) > 0 && Integer.parseInt(ctx.mesEntrada.getText()) < 13) && Integer.parseInt(ctx.anoEntrada.getText()) > 2020 && (Integer.parseInt(ctx.diaSaida.getText()) > 0 && Integer.parseInt(ctx.diaSaida.getText()) < 32) && (Integer.parseInt(ctx.mesSaida.getText()) > 0 && Integer.parseInt(ctx.mesSaida.getText()) < 13) && Integer.parseInt(ctx.anoSaida.getText()) > 2020) {

                    if (formmater1.parse(data1).before(formmater1.parse(data2))) {

                        //DAQUI
                        // Sender's email ID needs to be mentioned

                        // Get system properties
                        Properties properties = System.getProperties();

                        // Setup mail server
                        properties.put("mail.smtp.host", "smtp.gmail.com");
                        properties.put("mail.smtp.auth", "true");
                        properties.put("mail.smtp.starttls.enable", "true");
                        properties.put("mail.smtp.port", "587");
                        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");


                        Session session = Session.getDefaultInstance(properties, new Authenticator() {
                            @Override
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(from, signInMail);
                            }
                        });

                        // Create a default MimeMessage object.
                        MimeMessage message = new MimeMessage(session);
                        // Set From: header field of the header.
                        message.setFrom(new InternetAddress(from));
                        // Set To: header field of the header.
                        message.addRecipient(Message.RecipientType.TO, new InternetAddress(ctx.remet.getText()));
                        // Set Subject: header field
                        message.setSubject(ctx.tipoAusencia.getText());
                        // Now set the actual message
                        message.setText(ctx.justificacao.getText());
                        // Send message
                        Transport.send(message);
                        System.out.println("Email sent successfully....");
                        //AQUI - EMAIL ENVIADO

                        //DAQUI
                        JFrame frame = new JFrame("LPROG 2021");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                        Font font = new Font("Calibri", Font.BOLD, 21);
                        JLabel textLabel = new JLabel("  Este texto serve para autorizar o pedido de ausencia futura com data de inicio em " + data1 + " e saída em " + data2);
                        textLabel.setFont(font);

                        frame.add(textLabel);

                        frame.setSize(1100, 1000);
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);
                        frame.setAlwaysOnTop(true);
                        //AQUI - JANELA BRANCA
                    } else {
                        System.out.println("A data de inicio de ausencia é depois da data de fim, logo é incoerente!");
                        return null;
                    }

                } else {
                    System.out.println("Data inválida!");
                    return null;
                }

            } else {
                System.out.println("Tipo de ausencia incorreto. Os unicos disponveis são: Ferias, Justificada, Nao justificada");
                return null;
            }
        } catch (Exception e) {
            System.out.println("NOT OK");
        }
        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoAutAppDescFinanc(SprintCSEMLAPR4Parser.MetodoAutAppDescFinancContext ctx) {
        try {
        /*
        Validaçoes necessarias
         */
            boolean codigoValido = true;
            boolean recorrenciaValida = false;


            boolean eValido;
            Character[] codigoLetras = new Character[String.valueOf(ctx.codigoClienteConsoantes.getText()).length()];
            Character[] codigoNumeros = new Character[String.valueOf(ctx.codigoClienteNumeros.getText()).length()];


            for (int i = 0; i < ctx.codigoClienteConsoantes.getText().length(); i++) {
                codigoLetras[i] = ctx.codigoClienteConsoantes.getText().charAt(i);
            }
            for (int i = 0; i < ctx.codigoClienteNumeros.getText().length(); i++) {
                codigoNumeros[i] = ctx.codigoClienteNumeros.getText().charAt(i);
            }


            if (codigoLetras[0] == 'a' || codigoLetras[1] == 'a' || codigoLetras[2] == 'a' || codigoLetras[0] == 'e' || codigoLetras[1] == 'e' || codigoLetras[2] == 'e' || codigoLetras[0] == 'i' || codigoLetras[1] == 'i' || codigoLetras[2] == 'i' || codigoLetras[0] == 'o' || codigoLetras[1] == 'o' || codigoLetras[2] == 'o' || codigoLetras[0] == 'u' || codigoLetras[1] == 'u' || codigoLetras[2] == 'u' || !Character.isDigit(codigoNumeros[0]) || !Character.isDigit(codigoNumeros[1]) || !Character.isDigit(codigoNumeros[2])) {
                codigoValido = false;
            }
            if (ctx.recorrencia.getText().equalsIgnoreCase("Unica") || ctx.recorrencia.getText().equalsIgnoreCase("Ate Data Limite")) {
                recorrenciaValida = true;
            }

            eValido = codigoValido & recorrenciaValida;

            String mensagemAEnviar;

            if (eValido) {

                if (ctx.recorrencia.getText().equalsIgnoreCase("Unica")) {

                    mensagemAEnviar = "  Autorização para aplicação de desconto financeiro concedida com a fatura associada: " + ctx.idFatura.getText();

                } else {

                    mensagemAEnviar = "  Autorização para aplicação de desconto financeiro concedida ate à data limite de aplicação de desconto: " + ctx.dia.getText() + ":" + ctx.mes.getText() + ":" + ctx.ano.getText();

                }
            } else {

                mensagemAEnviar = "  Autorização para aplicação de desconto financeiro NÃO concedida \nporque o codigo ou a recorrencia não seguem os devidos campos";

            }
            // Sender's email ID needs to be mentioned

            // Get system properties
            Properties properties = System.getProperties();

            // Setup mail server
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");


            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, signInMail);
                }
            });

            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(ctx.emailCliente.getText()));
            // Set Subject: header field
            message.setSubject("Autorização para aplicação de desconto das finanças.");
            // Now set the actual message
            message.setText(mensagemAEnviar);
            // Send message
            Transport.send(message);
            System.out.println("\nEmail sent successfully....");
        } catch (Exception e) {
            System.out.println("NOT OK");
        }
        //AQUI - EMAIL ENVIADO
        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoAlterarResidenciaCliente(SprintCSEMLAPR4Parser.MetodoAlterarResidenciaClienteContext ctx) {
        try {
            int encontrou = 0;
            String pathToUse = getAbsolutePathFicheiro(ctx.fich.getText() + ctx.tipo.getText());

            //System.out.println(nomeFich);

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(ctx.idCliente.getText())) {

                    System.out.println("Cliente com id : " + ctx.idCliente.getText());
                    System.out.println();
                    System.out.println("Inicio da alteração de morada: ");
                    System.out.println("Dados antigos: ");
                    System.out.println("Rua : " + array[1]);
                    System.out.println("Número da porta : " + array[2]);
                    System.out.println("Código postal : " + array[3]);
                    System.out.println("Concelho: " + array[4]);
                    System.out.println();

                    System.out.println("Dados atualizados: ");
                    System.out.println();
                    System.out.println("Rua : " + ctx.ruaNova.getText());
                    System.out.println("Número da porta : " + ctx.doorNumber.getText());
                    System.out.println("Código postal : " + ctx.quatroPrimeirosDigitosCodPostal.getText() + '-' + ctx.tresUltimosDigitosCodPostal.getText());
                    System.out.println("Concelho: " + ctx.concelho.getText());

                    encontrou++;
                }

            }

            if (encontrou == 0) {
                System.out.println("Não existe cliente com esse id no ficheiro!");
            }
        } catch (Exception e) {
            System.out.println("NOT OK");
        }
        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoRequerCotacaoVendaPGrosso(SprintCSEMLAPR4Parser.MetodoRequerCotacaoVendaPGrossoContext ctx) {
        try {
            String pathToUse = getAbsolutePathFicheiro(ctx.fich.getText() + ctx.tipo.getText());

            //System.out.println(nomeFich);
            int encontrou = 0;
            double precoVenda;
            double descontoAAplicar;
            String categoriaProduto;
            double precoTotal;
            double precoTotalAposDescontos;
            double valorDoDesconto;


            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(ctx.codigoProduto.getText())) {
                    precoVenda = Double.parseDouble(array[1]);
                    categoriaProduto = array[2];
                    precoTotal = precoVenda * Integer.parseInt(ctx.quantidadePretendida.getText());
                    if (categoriaProduto.equalsIgnoreCase("ABC")) {
                        if (precoTotal > Integer.parseInt(array[3]) * 2) {
                            descontoAAplicar = 0.03;
                        } else {
                            descontoAAplicar = 0.01;
                        }
                    } else {

                        if (precoTotal > Integer.parseInt(array[3])) {
                            descontoAAplicar = 0.03;
                        } else {
                            descontoAAplicar = 0.01;
                        }
                    }

                    valorDoDesconto = precoTotal * descontoAAplicar;

                    precoTotalAposDescontos = precoTotal - valorDoDesconto;

                    String assunto = "Venda por grosso para o cliente do tipo " + ctx.tipoCliente.getText();

                    String mensagem = "Este email serve para indicar algumas informações:" +
                            "\nPreço venda: " + precoVenda +
                            "€\nDesconto a aplicar: " + descontoAAplicar +
                            "%\nQuantidade: " + ctx.quantidadePretendida.getText() +
                            "\nPreço total com descontos: " + precoTotalAposDescontos + "€";

                    //public static void main(String[] args) {
                    // Sender's email ID needs to be mentioned

                    // Get system properties
                    Properties properties = System.getProperties();

                    // Setup mail server
                    properties.put("mail.smtp.host", "smtp.gmail.com");
                    properties.put("mail.smtp.auth", "true");
                    properties.put("mail.smtp.starttls.enable", "true");
                    properties.put("mail.smtp.port", "587");
                    properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");


                    Session session = Session.getDefaultInstance(properties, new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(from, signInMail);
                        }
                    });

                    // Create a default MimeMessage object.
                    MimeMessage message = new MimeMessage(session);
                    // Set From: header field of the header.
                    message.setFrom(new InternetAddress(from));
                    // Set To: header field of the header.
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(ctx.remet.getText()));
                    // Set Subject: header field
                    message.setSubject(assunto);
                    // Now set the actual message
                    message.setText(mensagem);
                    // Send message
                    Transport.send(message);
                    System.out.println("Sent message successfully....");

                    encontrou++;
                }
            }

            if (encontrou == 0) {
                System.out.println("Não existe no ficheiro cliente com esse id");
            }

        } catch (Exception e) {
            System.out.println("NOT OK");
        }
        return null;
    } //FUNCIONAL 100%

    /*
    Métodos adicionais para provar que temos conhecimentos para mais
     */

    @Override
    public String visitMetodoLerRapelCliente(SprintCSEMLAPR4Parser.MetodoLerRapelClienteContext ctx) {
        try {
            int encontrou = 0;
            String pathToUse = getAbsolutePathFicheiro(ctx.fich.getText() + ctx.tipo.getText());

            //System.out.println(nomeFich);

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(ctx.idCliente.getText())) {
                    System.out.println("Rapel do cliente com id " + ctx.idCliente.getText() + ": " + array[1]);
                    encontrou++;
                }

            }

            if (encontrou == 0) {
                System.out.println("Não existe cliente com esse id no ficheiro!");
            }
        } catch (Exception e) {
            System.out.println("NOT OK");
        }
        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoAlterarRapelCliente(SprintCSEMLAPR4Parser.MetodoAlterarRapelClienteContext ctx) {
        try {
            String pathToUse = getAbsolutePathFicheiro(ctx.fich.getText() + ctx.tipo.getText());

            //System.out.println(nomeFich);
            int encontrou = 0;

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(ctx.idCliente.getText())) {
                    System.out.println("Antigo rapel do cliente com id " + ctx.idCliente.getText() + ": " + array[1]);
                    System.out.println("Novo rapel do cliente com id " + ctx.idCliente.getText() + " definido: " + ctx.novoRapel.getText());
                    encontrou++;
                }
            }

            if (encontrou == 0) {
                System.out.println("Não existe no ficheiro cliente com esse id");
            }

        } catch (Exception e) {
            System.out.println("NOT OK");
        }
        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoLerPrecoProduto(SprintCSEMLAPR4Parser.MetodoLerPrecoProdutoContext ctx) {

        try {
            String pathToUse = getAbsolutePathFicheiro(ctx.fich.getText() + ctx.tipo.getText());

            //System.out.println(nomeFich);

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(ctx.idProduto.getText())) {
                    System.out.println("Preço do produto com id: " + ctx.idProduto.getText() + ": " + array[1] + "€");
                    return String.valueOf(array[1]);
                }

            }
            System.out.println("Não existe cliente com esse id no ficheiro!");
        } catch (Exception e) {
            System.out.println("NOT OK");
        }

        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoAlterarPrecoProduto(SprintCSEMLAPR4Parser.MetodoAlterarPrecoProdutoContext ctx) {
        try {
            String pathToUse = getAbsolutePathFicheiro(ctx.fich.getText() + ctx.tipo.getText());

            //System.out.println(nomeFich);
            int encontrou = 0;

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(ctx.idProduto.getText())) {
                    System.out.println("Preço antigo do produto com id " + ctx.idProduto.getText() + ": " + array[1]);
                    System.out.println("Novo preço do produto com id " + ctx.idProduto.getText() + ": " + ctx.precoNovo.getText());
                    encontrou++;
                }
            }

            if (encontrou == 0) {
                System.out.println("Não existe produto com esse id no ficheiro");
            }

        } catch (Exception e) {
            System.out.println("NOT OK");
        }

        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoCalcularPrecoTotal(SprintCSEMLAPR4Parser.MetodoCalcularPrecoTotalContext ctx) {

        try {
            String pathToUse = getAbsolutePathFicheiro(ctx.fich.getText() + ctx.tipo.getText());

            //System.out.println(nomeFich);

            int encontrou = 0;

            int preco = 0;

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(ctx.idProduto.getText())) {
                    preco = Integer.parseInt(array[1]);
                    encontrou++;
                    break;
                }

            }

            if (encontrou == 0) {
                System.out.println("Não existe produto com esse id no ficheiro");
            } else {

                int result = preco * Integer.parseInt(ctx.quatidadeProduto.getText());
                if (preco != 0) {
                    System.out.println("Preço : " + preco + " - Quantidade : " + ctx.quatidadeProduto.getText());
                    System.out.println("O preço total é : " + result + "€");
                } else {
                    System.out.println("Não existe produto com esse id no ficheiro!");
                }
            }

        } catch (Exception e) {
            System.out.println("NOT OK");
        }
        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoAplicarDescontoRapel(SprintCSEMLAPR4Parser.MetodoAplicarDescontoRapelContext ctx) {

        try {
            String pathToUse = getAbsolutePathFicheiro(ctx.fich.getText() + ctx.tipo.getText());

            int preco = 0;

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(ctx.idProduto.getText())) {
                    preco = Integer.parseInt(array[1]);
                    break;
                }

            }

            int result = preco * Integer.parseInt(ctx.quatidadeProduto.getText());


            //ler rapel

            int encontrou = 0;
            int rapel = 0;
            String pathToUse2 = getAbsolutePathFicheiro(ctx.fich2.getText() + ctx.tipo2.getText());

            //System.out.println(nomeFich);

            Scanner sc2 = new Scanner(new File(pathToUse2));

            while (sc2.hasNextLine()) {

                String[] array = sc2.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(ctx.idCliente.getText())) {
                    rapel = Integer.parseInt(array[1]);
                    encontrou++;
                }

            }

            if (encontrou == 0) {
                System.out.println("Não existe cliente com esse id no ficheiro!");
                return null;
            }
            int precoComDesconto;

            if (rapel < Integer.parseInt(ctx.x.getText())) {
                System.out.println("Não há direito a desconto porque o rapel é " + rapel + " e o desconto só é " +
                        "aplicável a clientes com rapel supeior a " + ctx.x.getText());
            } else if (rapel < Integer.parseInt(ctx.y.getText())) {
                precoComDesconto = (int) (result * 0.98);
                System.out.printf("Foi aplicado um desconto de 2 por cento porque o rapel é %d e está entre %d e %d." +
                        "\nPreço antes do desconto: %d€" +
                        "\nPreço final: %d€", rapel, Integer.parseInt(ctx.x.getText()), Integer.parseInt(ctx.y.getText()), result, precoComDesconto);
            } else {
                precoComDesconto = (int) (result * 0.95);
                System.out.printf("Foi aplicado um desconto de 5 por cento porque o rapel é %d e é maior do que %d." +
                        "\nPreço antes do desconto: %d€" +
                        "\nPreço final: %d€", rapel, Integer.parseInt(ctx.y.getText()), result, precoComDesconto);
            }

        } catch (Exception e) {
            System.out.println("NOT OK");
        }
        return null;

    } //FUNCIONAL 100%

    @Override
    public String visitMetodoEnviarEmail(SprintCSEMLAPR4Parser.MetodoEnviarEmailContext ctx) {
        //public static void main(String[] args) {
        // Sender's email ID needs to be mentioned
        try {
            // Get system properties
            Properties properties = System.getProperties();

            // Setup mail server
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");


            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, signInMail);
                }
            });


            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(ctx.remet.getText()));
            // Set Subject: header field
            message.setSubject(ctx.assunto.getText());
            // Now set the actual message
            message.setText(ctx.mensagem.getText());
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (Exception mex) {
            System.out.println("NOT OK");
        }
        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoReportarAnomaliaDeComunicacao(SprintCSEMLAPR4Parser.MetodoReportarAnomaliaDeComunicacaoContext ctx) {
        //public static void main(String[] args) {
        // Sender's email ID needs to be mentioned
        try {
            // Get system properties
            Properties properties = System.getProperties();

            // Setup mail server
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");


            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, signInMail);
                }
            });


            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(ctx.remet.getText()));

            // Set Subject: header field
            String subject = "Tipo de Anomalia: " + ctx.tipoDeAnomalia.getText() + " - Tipo de Comunicacao: " + ctx.tipoDeComunicacao.getText();
            message.setSubject(subject);

            // This mail has 2 part, the BODY and the embedded image
            MimeMultipart multipart = new MimeMultipart("related");

            // first part (the html)
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText = "<H3>" + ctx.descricao.getText() + "</H3><img src=\"cid:image\">";
            messageBodyPart.setContent(htmlText, "text/html");
            // add it
            multipart.addBodyPart(messageBodyPart);

            // second part (the image)
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource(getAbsolutePathImagem(ctx.fotoProva.getText() + ctx.tipo.getText()));

            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<image>");

            // add image to the multipart
            multipart.addBodyPart(messageBodyPart);

            // put everything together
            message.setContent(multipart);
            // Send message
            Transport.send(message);

            System.out.println("Sent message successfully....");

        } catch (Exception mex) {
            System.out.println("NOT OK");
        }


        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoReportarAnomaliaNumEquipamento(SprintCSEMLAPR4Parser.MetodoReportarAnomaliaNumEquipamentoContext ctx) {
//public static void main(String[] args) {
        // Sender's email ID needs to be mentioned
        try {
            // Get system properties
            Properties properties = System.getProperties();

            // Setup mail server
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");


            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, signInMail);
                }
            });


            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(ctx.remet.getText()));

            // Set Subject: header field
            String subject = "Tipo de Anomalia: " + ctx.tipoDeAnomalia.getText() + " - Tipo de Equipamento: " + ctx.tipoDeEquipamento.getText();
            message.setSubject(subject);

            // This mail has 2 part, the BODY and the embedded image
            MimeMultipart multipart = new MimeMultipart("related");

            // first part (the html)
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText = "<H3>" + ctx.descricao.getText() + "</H3><img src=\"cid:image\">";
            messageBodyPart.setContent(htmlText, "text/html");
            // add it
            multipart.addBodyPart(messageBodyPart);

            // second part (the image)
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource(getAbsolutePathImagem(ctx.fotoProva.getText() + ctx.tipo.getText()));

            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<image>");

            // add image to the multipart
            multipart.addBodyPart(messageBodyPart);

            // put everything together
            message.setContent(multipart);
            // Send message
            Transport.send(message);

            System.out.println("Sent message successfully....");

        } catch (Exception mex) {
            System.out.println("NOT OK");
        }


        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoReportarAnomaliaNumaApp(SprintCSEMLAPR4Parser.MetodoReportarAnomaliaNumaAppContext ctx) {

        try {
            //public static void main(String[] args) {
            // Sender's email ID needs to be mentioned

            // Get system properties
            Properties properties = System.getProperties();

            // Setup mail server
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");


            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, signInMail);
                }
            });


            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(ctx.remet.getText()));

            // Set Subject: header field
            String subject = "Tipo de Anomalia: " + ctx.tipoDeAnomalia.getText() + " - Tipo de Equipamento: " + ctx.tipoDeEquipamentoAndroidOrApple.getText();
            message.setSubject(subject);

            // This mail has 2 part, the BODY and the embedded image
            MimeMultipart multipart = new MimeMultipart("related");

            // first part (the html)
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText = "<H3>" + ctx.descricao.getText() + "</H3><img src=\"cid:image\">";
            messageBodyPart.setContent(htmlText, "text/html");
            // add it
            multipart.addBodyPart(messageBodyPart);

            // second part (the image)
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource(getAbsolutePathImagem(ctx.fotoOuPrintProva.getText() + ctx.tipo.getText()));

            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<image>");

            // add image to the multipart
            multipart.addBodyPart(messageBodyPart);

            // put everything together
            message.setContent(multipart);
            // Send message
            Transport.send(message);

            System.out.println("Sent message successfully....");

        } catch (Exception mex) {
            System.out.println("NOT OK");
        }


        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoAlterarNibCliente(SprintCSEMLAPR4Parser.MetodoAlterarNibClienteContext ctx) {
        try {
            String pathToUse = getAbsolutePathFicheiro(ctx.fich.getText() + ctx.tipo.getText());

            //System.out.println(nomeFich);
            int encontrou = 0;

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(ctx.idCliente.getText())) {
                    System.out.println("Antigo NIB do cliente com id " + ctx.idCliente.getText() + ": " + array[1]);
                    System.out.println("Novo NIB do cliente com id " + ctx.idCliente.getText() + " definido: " + ctx.nibCliente.getText());
                    encontrou++;
                }
            }

            if (encontrou == 0) {
                System.out.println("Não existe no ficheiro cliente com esse id");
            }

        } catch (Exception e) {
            System.out.println("NOT OK");
        }
        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoAlterarEstadoCivilCliente(SprintCSEMLAPR4Parser.MetodoAlterarEstadoCivilClienteContext ctx) {
        try {
            String pathToUse = getAbsolutePathFicheiro(ctx.fich.getText() + ctx.tipo.getText());

            //System.out.println(nomeFich);
            int encontrou = 0;

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(ctx.idCliente.getText())) {
                    System.out.println("Antigo estado civil do cliente com id " + ctx.idCliente.getText() + ": " + array[1]);
                    System.out.println("Novo NIB do cliente com id " + ctx.idCliente.getText() + " definido: " + ctx.estadoCivil.getText());
                    encontrou++;
                }
            }

            if (encontrou == 0) {
                System.out.println("Não existe no ficheiro cliente com esse id");
            }

        } catch (Exception e) {
            System.out.println("NOT OK");
        }
        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoAtualHabilit(SprintCSEMLAPR4Parser.MetodoAtualHabilitContext ctx) {
        try {
            String pathToUse = getAbsolutePathFicheiro(ctx.fich.getText() + ctx.tipo.getText());

            //System.out.println(nomeFich);
            int encontrou = 0;

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(ctx.idCliente.getText())) {
                    System.out.println("Antigas habilitações do cliente com id " + ctx.idCliente.getText() + ": " + array[1]);
                    System.out.println("Novas habilitações do cliente com id " + ctx.idCliente.getText() + " definidas: " + ctx.habilit.getText());
                    encontrou++;
                }
            }

            if (encontrou == 0) {
                System.out.println("Não existe no ficheiro cliente com esse id");
            }

        } catch (Exception e) {
            System.out.println("NOT OK");
        }
        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoMarcaFerias(SprintCSEMLAPR4Parser.MetodoMarcaFeriasContext ctx) {
        //public static void main(String[] args) {
        // Sender's email ID needs to be mentioned
        try {
            String assunto = "Marcação de férias para o cliente com id " + ctx.idCliente.getText();
            String mensagem = String.format("Este email serve para marcar férias para o cliente acima mencionado nas datas: %s:%s:%s - %s:%s:%s",
                    ctx.diaEntrada.getText(), ctx.mesEntrada.getText(), ctx.anoEntrada.getText(), ctx.diaSaida.getText(), ctx.mesSaida.getText(), ctx.anoSaida.getText());

            // Get system properties
            Properties properties = System.getProperties();

            // Setup mail server
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");


            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, signInMail);
                }
            });

            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(ctx.remet.getText()));
            // Set Subject: header field
            message.setSubject(assunto);
            // Now set the actual message
            message.setText(mensagem);
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (Exception mex) {
            System.out.println("NOT OK");
            ;
        }
        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoJustificaFalta(SprintCSEMLAPR4Parser.MetodoJustificaFaltaContext ctx) {
        //public static void main(String[] args) {
        // Sender's email ID needs to be mentioned
        try {
            String assunto = "Justificação de falta do cliente com id " + ctx.idCliente.getText();
            String mensagem = String.format("Este email serve para justificar a falta do cliente acima mencionado na data: %s:%s:%s - \n" +
                            "Justificação: %s",
                    ctx.diaFalta.getText(), ctx.mesFalta.getText(), ctx.anoFalta.getText(), ctx.justificacao.getText());

            // Get system properties
            Properties properties = System.getProperties();

            // Setup mail server
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");


            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, signInMail);
                }
            });
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(ctx.remet.getText()));
            // Set Subject: header field
            message.setSubject(assunto);
            // Now set the actual message
            message.setText(mensagem);
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (Exception mex) {
            System.out.println("NOT OK");
        }
        return null;
    } //FUNCIONAL 100%

    @Override
    public String visitMetodoRemetente(SprintCSEMLAPR4Parser.MetodoRemetenteContext ctx) {
        return ctx.left.getText() + '@' + ctx.middle.getText() + '.' + ctx.right.getText();
    } //FUNCIONAL 100%

    public String getAbsolutePathFicheiro(String nome) {
        return String.valueOf(Paths.get(caminhoParaFicheiros + nome).toAbsolutePath());
    } //FUNCIONAL 100%

    public String getAbsolutePathImagem(String nome) {
        return String.valueOf(Paths.get(caminhoParaImages + nome).toAbsolutePath());
    } //FUNCIONAL 100%

}