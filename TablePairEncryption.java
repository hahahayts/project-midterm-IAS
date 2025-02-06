public class TablePairEncryption {

    // Pair 1
    private final String table1 = "ABCDEF";
    private final String table4 = "UVWXYZ";

    //    Pair 2
    private final String table2 = "HIJKLM";
    private final String table3 = "NOPQRS";

    private final String table5 = "GT";


    // ENCRYPTION METHOD
    public StringBuilder encrypt(String text){
        StringBuilder  encryptedText = new StringBuilder();
       
        for (int i = 0; i < text.length(); i++) {

            // Check for spaces
            if(text.charAt(i) == ' ')
            encryptedText.append('@');

            for (int j = 0; j < table5.length(); j++) {
                if(text.charAt(i) == table5.charAt(j)) 
                encryptedText.append(table5.charAt(j));

            }
            // Checking in Pair 1 
            for (int j = 0; j < table1.length(); j++) {
                if(text.charAt(i) == table1.charAt(j) ){
                    encryptedText.append(table4.charAt(j));
                }
                if(text.charAt(i) == table4.charAt(j)){
                    encryptedText.append(table1.charAt(j));
                }
            }

            // Checking in Pair 2 
            for (int j = 0; j < table1.length(); j++) {
                if(text.charAt(i) == table3.charAt(j) ){
                    encryptedText.append(table2.charAt(j));
                }
                if(text.charAt(i) == table2.charAt(j)){
                    encryptedText.append(table3.charAt(j));
                }
            }

        }

        return encryptedText;
    }

    // DECRYPTION METHOD
    public StringBuilder decrypt(String text){
        StringBuilder  decryptedText = new StringBuilder();
       
        for (int i = 0; i < text.length(); i++) {

            // Check for spaces
            if(text.charAt(i) == '@')
            decryptedText.append(' ');

            for (int j = 0; j < table5.length(); j++) {
                if(text.charAt(i) == table5.charAt(j)) 
                decryptedText.append(table5.charAt(j));

            }
            // Checking in Pair 1 
            for (int j = 0; j < table1.length(); j++) {
                if(text.charAt(i) == table1.charAt(j) ){
                    decryptedText.append(table4.charAt(j));
                }
                if(text.charAt(i) == table4.charAt(j)){
                    decryptedText.append(table1.charAt(j));
                }
                // break;
            }

            // Checking in Pair 2 
            for (int j = 0; j < table1.length(); j++) {
                if(text.charAt(i) == table3.charAt(j) ){
                    decryptedText.append(table2.charAt(j));
                }
                if(text.charAt(i) == table2.charAt(j)){
                    decryptedText.append(table3.charAt(j));
                }
                // break;
            }

        }

        return decryptedText;
    }
}
