public class InterfaceFuncionalPropria {
    public static void main(String[] args) {

        /** Usando a interface funcional.
         *  Como a interface tem só um método, não é necessário usar o return.
         *  Por exemplo, assim:
         *  Validador<String> validadorCEP =
         *          valor -> { return valor.matches("[0-9]{5}-[0-9]{3}"); };
         * */
        Validador<String> validadorCEP =
                valor -> valor.matches("[0-9]{5}-[0-9]{3}");

        System.out.println(validadorCEP.valida("04101-300"));
    }
}
