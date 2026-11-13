package service;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public final class DocService {

    public static String formatarCPF() {
        try {
            MaskFormatter mf = new MaskFormatter("###.###.###-##");
            mf.setPlaceholderCharacter('_');
            JFormattedTextField campo = new JFormattedTextField(mf);
            int resultado = JOptionPane.showConfirmDialog(null, campo, "Digite seu CPF", JOptionPane.OK_CANCEL_OPTION);

            if (resultado == JOptionPane.OK_OPTION) {
                return campo.getText();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }
    public static String formatarRG() {
        try {
            MaskFormatter mf = new MaskFormatter("##.###.###-#");
            mf.setPlaceholderCharacter('_');
            JFormattedTextField campo = new JFormattedTextField(mf);
            int resultado = JOptionPane.showConfirmDialog(null, campo, "Digite seu RG", JOptionPane.OK_CANCEL_OPTION);

            if (resultado == JOptionPane.OK_OPTION) {
                return campo.getText();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void validarCPF(String CPF) {
        var b=true;
        if (CPF == null) {
            b=false;
        }

        String cpf = CPF.replaceAll("\\D", "");

        if (cpf.length() != 11) {
            b=false;
        }

        if (cpf.chars().distinct().count() == 1) {
            b=false;
        }

        int digito1 = calcularDigito(cpf, 9);
        int digito2 = calcularDigito(cpf, 10);

        b = digito1 == (cpf.charAt(9) - '0')
            && digito2 == (cpf.charAt(10) - '0');
            if (b=false){
                throw new IllegalArgumentException("CPF inválido");
            }
    }

    private static int calcularDigito(String cpf, int posicao) {
        int soma = 0;

        for (int i = 0; i < posicao; i++) {
            soma += (cpf.charAt(i) - '0') * ((posicao + 1) - i);
        }

        int resto = (soma * 10) % 11;
        return resto == 10 ? 0 : resto;
    }
}
