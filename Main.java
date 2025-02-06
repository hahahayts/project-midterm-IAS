class Main{
    public static void main(String[] args) {
        TablePairEncryption tablePairEncryption = new TablePairEncryption();

        String text = "THE QUICK LITTE BROWN FOX JUMPS OVER THE LAZY DOG";
        StringBuilder encrypt = tablePairEncryption.encrypt(text);
        StringBuilder decrypt = tablePairEncryption.decrypt(encrypt.toString());

        System.out.println("Encrypted Text: "+ encrypt);
        System.out.println("Decrypted Text: "+ decrypt);

    }
}