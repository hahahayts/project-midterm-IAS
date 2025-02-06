class Main{
    public static void main(String[] args) {
        TablePairEncryption tablePairEncryption = new TablePairEncryption();

        String text = "JHOROSS TORRES";
        StringBuilder encrypt = tablePairEncryption.encrypt(text);
        StringBuilder decrypt = tablePairEncryption.decrypt(encrypt.toString());

        System.out.println("Encrypted Text: "+ encrypt);
        System.out.println("Decrypted Text: "+ decrypt);

    }
}