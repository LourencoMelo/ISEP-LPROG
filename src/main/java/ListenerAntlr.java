import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Scanner;
import java.util.Stack;

public class ListenerAntlr extends SprintCSEMLAPR4BaseListener {

    //esta variavel deve ser alterada conforme o computador em uso
    private static final String caminhoParaFicheiros = "src\\main\\java\\Ficheiros\\";

    private static final String caminhoParaImages = "src\\main\\java\\images\\";

    private static final String from = "lprog2021sprintd2de@gmail.com";

    private static final String signInMail = "lprog2021";

    private final Stack<String> stack = new Stack<>();

    public String getResult() {
        return stack.peek();
    }

    public String getAbsolutePathFicheiro(String nome) {
        return String.valueOf(Paths.get(caminhoParaFicheiros + nome).toAbsolutePath());
    }

    public String getAbsolutePathImagem(String nome) {
        return String.valueOf(Paths.get(caminhoParaImages + nome).toAbsolutePath());
    }

    /*
    Métodos pedidos como exemplo na mensagem no moodle de lapr
     */

    @Override
    public void enterMetodoInformaAusenciaFutura(SprintCSEMLAPR4Parser.MetodoInformaAusenciaFuturaContext ctx) {
        stack.push(ctx.justificacao.getText());
        stack.push(ctx.remet.getText());
        stack.push(ctx.tipoAusencia.getText());
        stack.push(ctx.anoSaida.getText());
        stack.push(ctx.mesSaida.getText());
        stack.push(ctx.diaSaida.getText());
        stack.push(ctx.anoEntrada.getText());
        stack.push(ctx.mesEntrada.getText());
        stack.push(ctx.diaEntrada.getText());
    }

    @Override
    public void exitMetodoInformaAusenciaFutura(SprintCSEMLAPR4Parser.MetodoInformaAusenciaFuturaContext ctx) {
        try {
            SimpleDateFormat formmater1 = new SimpleDateFormat("dd:MM:yyyy");
            String random = stack.pop();
            String diaEntrada = stack.pop();
            String mesEntrada = stack.pop();
            String anoEntrada = stack.pop();
            String diaSaida = stack.pop();
            String mesSaida = stack.pop();
            String anoSaida = stack.pop();
            String tipoAusencia = stack.pop();

            String data1 = diaEntrada + ":" + mesEntrada + ":" + anoEntrada;
            String data2 = diaSaida + ":" + mesSaida + ":" + anoSaida;

            if (tipoAusencia.equalsIgnoreCase("Ferias") || tipoAusencia.equalsIgnoreCase("Justificada") || tipoAusencia.equalsIgnoreCase("Nao justificada")) {

                if ((Integer.parseInt(diaEntrada) > 0 && Integer.parseInt(diaEntrada) < 32) && (Integer.parseInt(mesEntrada) > 0 && Integer.parseInt(mesEntrada) < 13) && Integer.parseInt(anoEntrada) > 2020 && (Integer.parseInt(diaSaida) > 0 && Integer.parseInt(diaSaida) < 32) && (Integer.parseInt(mesSaida) > 0 && Integer.parseInt(mesSaida) < 13) && Integer.parseInt(anoSaida) > 2020) {

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
                        message.addRecipient(Message.RecipientType.TO, new InternetAddress(stack.pop()));
                        // Set Subject: header field
                        message.setSubject(tipoAusencia);
                        // Now set the actual message
                        message.setText(stack.pop());
                        // Send message
                        Transport.send(message);
                        stack.push("Email sent successfully....");
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
                        stack.push("A data de inicio de ausencia é depois da data de fim, logo é incoerente!");
                    }

                } else {
                    stack.push("Data inválida!");
                }

            } else {
                stack.push("Tipo de ausencia incorreto. Os unicos disponveis são: Ferias, Justificada, Nao justificada");
            }
        } catch (Exception e) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoAutAppDescFinanc(SprintCSEMLAPR4Parser.MetodoAutAppDescFinancContext ctx) {
        stack.push(ctx.emailCliente.getText());
        stack.push(ctx.ano.getText());
        stack.push(ctx.mes.getText());
        stack.push(ctx.dia.getText());
        stack.push(ctx.idFatura.getText());
        stack.push(ctx.recorrencia.getText());
        stack.push(ctx.codigoClienteNumeros.getText());
        stack.push(ctx.codigoClienteConsoantes.getText());
    }

    @Override
    public void exitMetodoAutAppDescFinanc(SprintCSEMLAPR4Parser.MetodoAutAppDescFinancContext ctx) {
        try {
            String random = stack.pop();
            String codigoClienteConsoantes = stack.pop();
            String codigoClienteNumeros = stack.pop();
            String recorrencia = stack.pop();
            String idFatura = stack.pop();
            String dia = stack.pop();
            String mes = stack.pop();
            String ano = stack.pop();
            String emailCliente = stack.pop();

        /*
        Validaçoes necessarias
         */
            boolean codigoValido = true;
            boolean recorrenciaValida = false;

            boolean eValido;
            Character[] codigoLetras = new Character[String.valueOf(codigoClienteConsoantes).length()];
            Character[] codigoNumeros = new Character[String.valueOf(codigoClienteNumeros).length()];


            for (int i = 0; i < codigoClienteConsoantes.length(); i++) {
                codigoLetras[i] = codigoClienteConsoantes.charAt(i);
            }
            for (int i = 0; i < codigoClienteNumeros.length(); i++) {
                codigoNumeros[i] = codigoClienteNumeros.charAt(i);
            }


            if (codigoLetras[0] == 'a' || codigoLetras[1] == 'a' || codigoLetras[2] == 'a' || codigoLetras[0] == 'e' || codigoLetras[1] == 'e' || codigoLetras[2] == 'e' || codigoLetras[0] == 'i' || codigoLetras[1] == 'i' || codigoLetras[2] == 'i' || codigoLetras[0] == 'o' || codigoLetras[1] == 'o' || codigoLetras[2] == 'o' || codigoLetras[0] == 'u' || codigoLetras[1] == 'u' || codigoLetras[2] == 'u' || !Character.isDigit(codigoNumeros[0]) || !Character.isDigit(codigoNumeros[1]) || !Character.isDigit(codigoNumeros[2])) {
                codigoValido = false;
            }

            if (recorrencia.equalsIgnoreCase("Unica") || recorrencia.equalsIgnoreCase("Ate Data Limite")) {
                recorrenciaValida = true;
            }

            eValido = codigoValido & recorrenciaValida;

            String mensagemAEnviar;

            if (eValido) {

                if (recorrencia.equalsIgnoreCase("Unica")) {

                    mensagemAEnviar = "  Autorização para aplicação de desconto financeiro concedida com a fatura associada: " + idFatura;

                } else {

                    mensagemAEnviar = "  Autorização para aplicação de desconto financeiro concedida ate à data limite de aplicação de desconto: " + dia + ":" + mes + ":" + ano;

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
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailCliente));
            // Set Subject: header field
            message.setSubject("Autorização para aplicação de desconto das finanças.");
            // Now set the actual message
            message.setText(mensagemAEnviar);
            // Send message
            Transport.send(message);
            stack.push("Email sent successfully....");
        } catch (Exception e) {
            stack.push("NOT OK");
        }
        //AQUI - EMAIL ENVIADO
    }

    @Override
    public void enterMetodoAlterarResidenciaCliente(SprintCSEMLAPR4Parser.MetodoAlterarResidenciaClienteContext ctx) {
        stack.push(ctx.concelho.getText());
        stack.push(ctx.tresUltimosDigitosCodPostal.getText());
        stack.push(ctx.quatroPrimeirosDigitosCodPostal.getText());
        stack.push(ctx.doorNumber.getText());
        stack.push(ctx.ruaNova.getText());
        stack.push(ctx.idCliente.getText());
        stack.push(ctx.tipo.getText());
        stack.push(ctx.fich.getText());
    }

    @Override
    public void exitMetodoAlterarResidenciaCliente(SprintCSEMLAPR4Parser.MetodoAlterarResidenciaClienteContext ctx) {
        try {
            String fich = stack.pop();
            String tipo = stack.pop();
            String idCliente = stack.pop();
            String ruaNova = stack.pop();
            String doorNumber = stack.pop();
            String quatroPrimeirosDigitosCodPostal = stack.pop();
            String tresUltimosDigitosCodPostal = stack.pop();
            String concelho = stack.pop();

            int encontrou = 0;
            String pathToUse = getAbsolutePathFicheiro(fich + tipo);

            //System.out.println(nomeFich);

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(idCliente)) {

                    stack.push(String.format("Cliente com id : %s \n\n Inicio da alteração de morada : \n Dados antigos:" +
                                    " \n Rua: %s \n Número da porta : %s \n Código postal : %s \n Concelho : %s \n\n Dados atual" +
                                    "izados: \n\n Rua: %s \n Número da porta : %s \n Código postal : %s - %s \n Concelho %s \n",
                            idCliente, array[1], array[2], array[3], array[4], ruaNova, doorNumber,
                            quatroPrimeirosDigitosCodPostal, tresUltimosDigitosCodPostal, concelho));

                    encontrou++;
                }

            }

            if (encontrou == 0) {
                stack.push("Não existe cliente com esse id no ficheiro!");
            }
        } catch (Exception e) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoRequerCotacaoVendaPGrosso(SprintCSEMLAPR4Parser.MetodoRequerCotacaoVendaPGrossoContext ctx) {
        stack.push(ctx.remet.getText());
        stack.push(ctx.tipoCliente.getText());
        stack.push(ctx.quantidadePretendida.getText());
        stack.push(ctx.codigoProduto.getText());
        stack.push(ctx.tipo.getText());
        stack.push(ctx.fich.getText());
    }

    @Override
    public void exitMetodoRequerCotacaoVendaPGrosso(SprintCSEMLAPR4Parser.MetodoRequerCotacaoVendaPGrossoContext ctx) {
        try {
            String random = stack.pop();

            double precoVenda;
            String categoriaProduto;
            double precoTotal;
            double descontoAAplicar;
            double valorDoDesconto;
            double precoTotalAposDescontos;

            int encontrou = 0;


            String fich = stack.pop();
            String tipo = stack.pop();
            String codigoProduto = stack.pop();
            String quantidade = stack.pop();
            String tipoCliente = stack.pop();
            String remet = stack.pop();

            String pathToUse = getAbsolutePathFicheiro(fich + tipo);

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(codigoProduto)) {
                    precoVenda = Double.parseDouble(array[1]);
                    categoriaProduto = array[2];
                    precoTotal = precoVenda * Integer.parseInt(quantidade);
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

                    String assunto = "Venda por grosso para o cliente do tipo " + tipoCliente;

                    String mensagem = "Este email serve para indicar algumas informações:" +
                            "\nPreço venda: " + precoVenda +
                            "€\nDesconto a aplicar: " + descontoAAplicar +
                            "%\nQuantidade: " + quantidade +
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
                        message.addRecipient(Message.RecipientType.TO, new InternetAddress(remet));
                        // Set Subject: header field
                        message.setSubject(assunto);
                        // Now set the actual message
                        message.setText(mensagem);
                        // Send message
                        Transport.send(message);
                        stack.push("Sent message successfully....");


                    encontrou++;
                }
            }

            if (encontrou == 0) {
                System.out.println("Não existe no ficheiro cliente com esse id");
            }

        } catch (Exception e) {
            stack.push("NOT OK");
        }
    }

    /*
    Métodos adicionais para provar que temos conhecimentos para mais
     */

    @Override
    public void enterMetodoEnviarEmail(SprintCSEMLAPR4Parser.MetodoEnviarEmailContext ctx) {
        stack.push(ctx.mensagem.getText());
        stack.push(ctx.assunto.getText());
        stack.push(ctx.remet.getText());
    }

    @Override
    public void exitMetodoEnviarEmail(SprintCSEMLAPR4Parser.MetodoEnviarEmailContext ctx) {
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


            String random = stack.pop();

            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(stack.pop()));
            // Set Subject: header field
            message.setSubject(stack.pop());
            // Now set the actual message
            message.setText(stack.pop());
            // Send message
            Transport.send(message);
            stack.push("Sent message successfully....");
        } catch (Exception mex) {
            stack.push("NOT OK");
            stack.push("Sent message NOT successfully....");
        }

    }

    @Override
    public void enterMetodoLerRapelCliente(SprintCSEMLAPR4Parser.MetodoLerRapelClienteContext ctx) {
        stack.push(ctx.idCliente.getText());
        stack.push(ctx.tipo.getText());
        stack.push(ctx.fich.getText());
    }

    @Override
    public void exitMetodoLerRapelCliente(SprintCSEMLAPR4Parser.MetodoLerRapelClienteContext ctx) {
        try {
            int encontrou = 0;
            String pathToUse = getAbsolutePathFicheiro(stack.pop() + stack.pop());

            Scanner sc = new Scanner(new File(pathToUse));

            String idClient = stack.pop();
            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(idClient)) {
                    stack.push("Rapel do cliente com id " + idClient + ": " + array[1]);
                    encontrou++;
                }
            }
            if (encontrou == 0) {
                stack.push("Não existe cliente com esse id no ficheiro!");
            }
        } catch (Exception e) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoAlterarRapelCliente(SprintCSEMLAPR4Parser.MetodoAlterarRapelClienteContext ctx) {
        stack.push(ctx.novoRapel.getText());
        stack.push(ctx.idCliente.getText());
        stack.push(ctx.tipo.getText());
        stack.push(ctx.fich.getText());
    }

    @Override
    public void exitMetodoAlterarRapelCliente(SprintCSEMLAPR4Parser.MetodoAlterarRapelClienteContext ctx) {
        try {
            String pathToUse = getAbsolutePathFicheiro(stack.pop() + stack.pop());

            //System.out.println(nomeFich);
            int encontrou = 0;

            Scanner sc = new Scanner(new File(pathToUse));

            String idCliente = stack.pop();
            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(idCliente)) {
                    stack.push("Novo rapel do cliente com id " + idCliente + " definido: " + stack.pop() + "\nAntigo rapel do cliente com id " + idCliente + ": " + array[1]);
                    encontrou++;
                }
            }

            if (encontrou == 0) {
                stack.push("Não existe no ficheiro cliente com esse id");
            }

        } catch (Exception e) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoLerPrecoProduto(SprintCSEMLAPR4Parser.MetodoLerPrecoProdutoContext ctx) {
        stack.push(ctx.idProduto.getText());
        stack.push(ctx.tipo.getText());
        stack.push(ctx.fich.getText());
    }

    @Override
    public void exitMetodoLerPrecoProduto(SprintCSEMLAPR4Parser.MetodoLerPrecoProdutoContext ctx) {
        try {
            String pathToUse = getAbsolutePathFicheiro(stack.pop() + stack.pop());

            //System.out.println(nomeFich);

            int encontrou = 0;

            Scanner sc = new Scanner(new File(pathToUse));
            String idProduto = stack.pop();

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(idProduto)) {
                    stack.push("Preço do produto com id: " + idProduto + ": " + array[1] + "€");
                    encontrou++;
                }
            }
            if (encontrou == 0) {
                stack.push("Não existe cliente com esse id no ficheiro!");
            }
        } catch (Exception e) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoAlterarPrecoProduto(SprintCSEMLAPR4Parser.MetodoAlterarPrecoProdutoContext ctx) {
        stack.push(ctx.precoNovo.getText());
        stack.push(ctx.idProduto.getText());
        stack.push(ctx.tipo.getText());
        stack.push(ctx.fich.getText());
    }

    @Override
    public void exitMetodoAlterarPrecoProduto(SprintCSEMLAPR4Parser.MetodoAlterarPrecoProdutoContext ctx) {
        try {
            String pathToUse = getAbsolutePathFicheiro(stack.pop() + stack.pop());

            //System.out.println(nomeFich);
            int encontrou = 0;

            Scanner sc = new Scanner(new File(pathToUse));
            String idProduto = stack.pop();
            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(idProduto)) {
                    stack.push("Preço antigo do produto com id " + idProduto + ": " + array[1]);
                    stack.push("Novo preço do produto com id " + idProduto + ": " + stack.pop());
                    encontrou++;
                }
            }

            if (encontrou == 0) {
                stack.push("Não existe produto com esse id no ficheiro");
            }

        } catch (Exception e) {
            stack.push("NOT OK");
        }

    }

    @Override
    public void enterMetodoCalcularPrecoTotal(SprintCSEMLAPR4Parser.MetodoCalcularPrecoTotalContext ctx) {
        stack.push(ctx.quatidadeProduto.getText());
        stack.push(ctx.idProduto.getText());
        stack.push(ctx.tipo.getText());
        stack.push(ctx.fich.getText());
    }

    @Override
    public void exitMetodoCalcularPrecoTotal(SprintCSEMLAPR4Parser.MetodoCalcularPrecoTotalContext ctx) {
        try {
            String pathToUse = getAbsolutePathFicheiro(stack.pop() + stack.pop());

            //System.out.println(nomeFich);

            int preco = 0;

            Scanner sc = new Scanner(new File(pathToUse));

            String codigo = stack.pop();

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(codigo)) {
                    preco = Integer.parseInt(array[1]);
                    break;
                }

            }
            String qtdProd = stack.pop();
            int result = preco * Integer.parseInt(qtdProd);
            if (preco != 0) {
                stack.push("Preço : " + preco + " - Quantidade : " + qtdProd + "\nO preço total é : " + result + "€");
            } else {
                stack.push("Não existe produto com esse id no ficheiro!");
            }

        } catch (Exception e) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoAplicarDescontoRapel(SprintCSEMLAPR4Parser.MetodoAplicarDescontoRapelContext ctx) {
        stack.push(ctx.y.getText());
        stack.push(ctx.x.getText());
        stack.push(ctx.idCliente.getText());
        stack.push(ctx.tipo2.getText());
        stack.push(ctx.fich2.getText());
        stack.push(ctx.quatidadeProduto.getText());
        stack.push(ctx.idProduto.getText());
        stack.push(ctx.tipo.getText());
        stack.push(ctx.fich.getText());
    }

    @Override
    public void exitMetodoAplicarDescontoRapel(SprintCSEMLAPR4Parser.MetodoAplicarDescontoRapelContext ctx) {
        try {
            String pathToUse = getAbsolutePathFicheiro(stack.pop() + stack.pop());

            int preco = 0;

            Scanner sc = new Scanner(new File(pathToUse));

            String codigo = stack.pop();

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(codigo)) {
                    preco = Integer.parseInt(array[1]);
                    break;
                }

            }

            int result = preco * Integer.parseInt(stack.pop());

            //ler rapel

            int encontrou = 0;
            int rapel = 0;
            String pathToUse2 = getAbsolutePathFicheiro(stack.pop() + stack.pop());

            //System.out.println(nomeFich);

            Scanner sc2 = new Scanner(new File(pathToUse2));

            String codigo2 = stack.pop();

            while (sc2.hasNextLine()) {

                String[] array = sc2.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(codigo2)) {
                    rapel = Integer.parseInt(array[1]);
                    encontrou++;
                }

            }

            if (encontrou == 0) {
                stack.push("Não existe cliente com esse id no ficheiro!");
            } else {
                int precoComDesconto;
                String x = stack.pop();
                String y = stack.pop();
                if (rapel < Integer.parseInt(x)) {
                    stack.push("Não há direito a desconto porque o rapel é " + rapel + " e o desconto só é " +
                            "aplicável a clientes com rapel supeior a " + x);
                } else if (rapel < Integer.parseInt(y)) {
                    precoComDesconto = (int) (result * 0.98);
                    stack.push(String.format("Foi aplicado um desconto de 2 por cento porque o rapel é %d e está entre %d e %d." +
                            "\nPreço antes do desconto: %d€" +
                            "\nPreço final: %d€", rapel, Integer.parseInt(ctx.x.getText()), Integer.parseInt(y), result, precoComDesconto));
                } else {
                    precoComDesconto = (int) (result * 0.95);
                    stack.push(String.format("Foi aplicado um desconto de 5 por cento porque o rapel é %d e é maior do que %d." +
                            "\nPreço antes do desconto: %d€" +
                            "\nPreço final: %d€", rapel, Integer.parseInt(y), result, precoComDesconto));
                }
            }
        } catch (Exception e) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoReportarAnomaliaDeComunicacao(SprintCSEMLAPR4Parser.MetodoReportarAnomaliaDeComunicacaoContext ctx) {
        stack.push(ctx.tipo.getText());
        stack.push(ctx.fotoProva.getText());
        stack.push(ctx.descricao.getText());
        stack.push(ctx.tipoDeComunicacao.getText());
        stack.push(ctx.tipoDeAnomalia.getText());
        stack.push(ctx.remet.getText());
    }

    @Override
    public void exitMetodoReportarAnomaliaDeComunicacao(SprintCSEMLAPR4Parser.MetodoReportarAnomaliaDeComunicacaoContext ctx) {
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


            String random = stack.pop();

            String remet = stack.pop();
            String tipoDeAnomalia = stack.pop();
            String tipoComunicacao = stack.pop();
            String descricao = stack.pop();
            String fotoProva = stack.pop();
            String tipo = stack.pop();

            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(remet));

            // Set Subject: header field
            String subject = "Tipo de Anomalia: " + tipoDeAnomalia + " - Tipo de Comunicacao: " + tipoComunicacao;
            message.setSubject(subject);

            // This mail has 2 part, the BODY and the embedded image
            MimeMultipart multipart = new MimeMultipart("related");

            // first part (the html)
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText = "<H3>" + descricao + "</H3><img src=\"cid:image\">";
            messageBodyPart.setContent(htmlText, "text/html");
            // add it
            multipart.addBodyPart(messageBodyPart);

            // second part (the image)
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource(getAbsolutePathImagem(fotoProva + tipo));

            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<image>");

            // add image to the multipart
            multipart.addBodyPart(messageBodyPart);

            // put everything together
            message.setContent(multipart);
            // Send message
            Transport.send(message);

            stack.push("Sent message successfully....");

        } catch (Exception mex) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoReportarAnomaliaNumEquipamento(SprintCSEMLAPR4Parser.MetodoReportarAnomaliaNumEquipamentoContext ctx) {
        stack.clear();
        stack.push(ctx.remet.getText());
        stack.push(ctx.tipo.getText());
        stack.push(ctx.fotoProva.getText());
        stack.push(ctx.descricao.getText());
        stack.push(ctx.tipoDeEquipamento.getText());
        stack.push(ctx.tipoDeAnomalia.getText());
    }

    @Override
    public void exitMetodoReportarAnomaliaNumEquipamento(SprintCSEMLAPR4Parser.MetodoReportarAnomaliaNumEquipamentoContext ctx) {
        try {
            String random = stack.pop();
            String tipoDeAnomalia = stack.pop();
            String tipoDeEquipamento = stack.pop();
            String descricao = stack.pop();
            String fotoProva = stack.pop();
            String tipo = stack.pop();
            String remet = stack.pop();

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
                    InternetAddress.parse(remet));

            // Set Subject: header field
            String subject = "Tipo de Anomalia: " + tipoDeAnomalia + " - Tipo de Equipamento: " + tipoDeEquipamento;
            message.setSubject(subject);

            // This mail has 2 part, the BODY and the embedded image
            MimeMultipart multipart = new MimeMultipart("related");

            // first part (the html)
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText = "<H3>" + descricao + "</H3><img src=\"cid:image\">";
            messageBodyPart.setContent(htmlText, "text/html");
            // add it
            multipart.addBodyPart(messageBodyPart);

            // second part (the image)
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource(getAbsolutePathImagem(fotoProva + tipo));

            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<image>");

            // add image to the multipart
            multipart.addBodyPart(messageBodyPart);

            // put everything together
            message.setContent(multipart);
            // Send message
            Transport.send(message);

            stack.push("Sent message successfully....");

        } catch (Exception mex) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoReportarAnomaliaNumaApp(SprintCSEMLAPR4Parser.MetodoReportarAnomaliaNumaAppContext ctx) {
        stack.push(ctx.tipo.getText());
        stack.push(ctx.fotoOuPrintProva.getText());
        stack.push(ctx.descricao.getText());
        stack.push(ctx.tipoDeEquipamentoAndroidOrApple.getText());
        stack.push(ctx.tipoDeAnomalia.getText());
        stack.push(ctx.remet.getText());
    }


    @Override
    public void exitMetodoReportarAnomaliaNumaApp(SprintCSEMLAPR4Parser.MetodoReportarAnomaliaNumaAppContext ctx) {

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


            String random = stack.pop();

            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(stack.pop()));

            // Set Subject: header field
            String subject = "Tipo de Anomalia: " + stack.pop() + " - Tipo de Equipamento: " + stack.pop();
            message.setSubject(subject);

            // This mail has 2 part, the BODY and the embedded image
            MimeMultipart multipart = new MimeMultipart("related");

            // first part (the html)
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText = "<H3>" + stack.pop() + "</H3><img src=\"cid:image\">";
            messageBodyPart.setContent(htmlText, "text/html");
            // add it
            multipart.addBodyPart(messageBodyPart);

            // second part (the image)
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource(getAbsolutePathImagem(stack.pop() + stack.pop()));

            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<image>");

            // add image to the multipart
            multipart.addBodyPart(messageBodyPart);

            // put everything together
            message.setContent(multipart);
            // Send message
            Transport.send(message);

            stack.push("Sent message successfully....");

        } catch (Exception mex) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoAlterarNibCliente(SprintCSEMLAPR4Parser.MetodoAlterarNibClienteContext ctx) {
        stack.push(ctx.nibCliente.getText());
        stack.push(ctx.idCliente.getText());
        stack.push(ctx.tipo.getText());
        stack.push(ctx.fich.getText());
    }

    @Override
    public void exitMetodoAlterarNibCliente(SprintCSEMLAPR4Parser.MetodoAlterarNibClienteContext ctx) {
        try {
            String fich = stack.pop();
            String tipo = stack.pop();
            String idCliente = stack.pop();
            String nibCliente = stack.pop();
            String pathToUse = getAbsolutePathFicheiro(fich + tipo);

            //System.out.println(nomeFich);
            int encontrou = 0;

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(idCliente)) {
                    stack.push(String.format("Antigo NIB do cliente com id %s : %s \nNovo NIB do cliente com id %s : %s", idCliente, array[1], idCliente, nibCliente));
                    encontrou++;
                }
            }

            if (encontrou == 0) {
                stack.push("Não existe no ficheiro cliente com esse id");
            }

        } catch (Exception e) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoAlterarEstadoCivilCliente(SprintCSEMLAPR4Parser.MetodoAlterarEstadoCivilClienteContext ctx) {
        stack.push(ctx.estadoCivil.getText());
        stack.push(ctx.idCliente.getText());
        stack.push(ctx.tipo.getText());
        stack.push(ctx.fich.getText());
    }

    @Override
    public void exitMetodoAlterarEstadoCivilCliente(SprintCSEMLAPR4Parser.MetodoAlterarEstadoCivilClienteContext ctx) {
        try {
            String fich = stack.pop();
            String tipo = stack.pop();
            String idCliente = stack.pop();
            String estadoCivil = stack.pop();

            String pathToUse = getAbsolutePathFicheiro(fich + tipo);

            //System.out.println(nomeFich);
            int encontrou = 0;

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(idCliente)) {
                    stack.push(String.format("Antigo estado civil do cliente com id %s : %s \nNovo estado civil do cliente com id %s : %s", idCliente, array[1], idCliente, estadoCivil));
                    encontrou++;
                }
            }

            if (encontrou == 0) {
                stack.push("Não existe no ficheiro cliente com esse id");
            }

        } catch (Exception e) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoAtualHabilit(SprintCSEMLAPR4Parser.MetodoAtualHabilitContext ctx) {
        stack.push(ctx.habilit.getText());
        stack.push(ctx.idCliente.getText());
        stack.push(ctx.tipo.getText());
        stack.push(ctx.fich.getText());
    }

    @Override
    public void exitMetodoAtualHabilit(SprintCSEMLAPR4Parser.MetodoAtualHabilitContext ctx) {
        try {
            String fich = stack.pop();
            String tipo = stack.pop();
            String idCliente = stack.pop();
            String habilit = stack.pop();

            String pathToUse = getAbsolutePathFicheiro(fich + tipo);

            int encontrou = 0;

            Scanner sc = new Scanner(new File(pathToUse));

            while (sc.hasNextLine()) {

                String[] array = sc.nextLine().trim().split(";");

                if (array[0].equalsIgnoreCase(idCliente)) {
                    stack.push(String.format("Antigas habilitações do cliente com id %s : %s \nNovas habilitações do cliente com id %s : %s", idCliente, array[1], idCliente, habilit));
                    encontrou++;
                }
            }

            if (encontrou == 0) {
                stack.push("Não existe no ficheiro cliente com esse id");
            }

        } catch (Exception e) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoMarcaFerias(SprintCSEMLAPR4Parser.MetodoMarcaFeriasContext ctx) {
        stack.push(ctx.remet.getText());
        stack.push(ctx.anoSaida.getText());
        stack.push(ctx.mesSaida.getText());
        stack.push(ctx.diaSaida.getText());
        stack.push(ctx.anoEntrada.getText());
        stack.push(ctx.mesEntrada.getText());
        stack.push(ctx.diaEntrada.getText());
        stack.push(ctx.idCliente.getText());
    }

    @Override
    public void exitMetodoMarcaFerias(SprintCSEMLAPR4Parser.MetodoMarcaFeriasContext ctx) {
        try {
            String random = stack.pop();
            String idCliente = stack.pop();
            String diaEntrada = stack.pop();
            String mesEntrada = stack.pop();
            String anoEntrada = stack.pop();
            String diaSaida = stack.pop();
            String mesSaida = stack.pop();
            String anoSaida = stack.pop();
            String remet = stack.pop();

            String assunto = "Marcação de férias para o cliente com id " + idCliente;
            String mensagem = String.format("Este email serve para marcar férias para o cliente acima mencionado nas datas: %s:%s:%s - %s:%s:%s",
                    diaEntrada, mesEntrada, anoEntrada, diaSaida, mesSaida, anoSaida);

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
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(remet));
            // Set Subject: header field
            message.setSubject(assunto);
            // Now set the actual message
            message.setText(mensagem);
            // Send message
            Transport.send(message);
            stack.push("Sent message successfully....");
        } catch (Exception mex) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoJustificaFalta(SprintCSEMLAPR4Parser.MetodoJustificaFaltaContext ctx) {
        stack.push(ctx.remet.getText());
        stack.push(ctx.justificacao.getText());
        stack.push(ctx.anoFalta.getText());
        stack.push(ctx.mesFalta.getText());
        stack.push(ctx.diaFalta.getText());
        stack.push(ctx.idCliente.getText());
    }

    @Override
    public void exitMetodoJustificaFalta(SprintCSEMLAPR4Parser.MetodoJustificaFaltaContext ctx) {
        try {
            String random = stack.pop();
            String idCliente = stack.pop();
            String diaFalta = stack.pop();
            String mesFalta = stack.pop();
            String anoFalta = stack.pop();
            String justificacao = stack.pop();
            String remet = stack.pop();

            String assunto = "Justificação de falta do cliente com id " + idCliente;
            String mensagem = String.format("Este email serve para justificar a falta do cliente acima mencionado na data: %s:%s:%s - \n" +
                            "Justificação: %s",
                    diaFalta, mesFalta, anoFalta, justificacao);

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
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(remet));
            // Set Subject: header field
            message.setSubject(assunto);
            // Now set the actual message
            message.setText(mensagem);
            // Send message
            Transport.send(message);
            stack.push("Sent message successfully....");
        } catch (Exception mex) {
            stack.push("NOT OK");
        }
    }

    @Override
    public void enterMetodoRemetente(SprintCSEMLAPR4Parser.MetodoRemetenteContext ctx) {
        stack.push(ctx.right.getText());
        stack.push(ctx.middle.getText());
        stack.push(ctx.left.getText());
    }

    @Override
    public void exitMetodoRemetente(SprintCSEMLAPR4Parser.MetodoRemetenteContext ctx) {
        stack.push(stack.pop() + '@' + stack.pop() + '.' + stack.pop());
    }

}