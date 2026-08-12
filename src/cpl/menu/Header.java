package cpl.menu;

import cpl.style.Write;

public class Header {


    private String divider;
    private int delay;

    public Header(){
        this.delay = 50;
    }

    public void simple(String title){
        if(dividerIsNull()){
            header(title);
        }else{
            header(title, divider);
        }
    }

    public void type(String title){
        if(dividerIsNull()){
            typeHeader(title, getDelay());
        } else {
            typeHeader(title, getDelay(), getDivider());
        }
    }


    public void type(String title, int delay){
        if(dividerIsNull()){
            typeHeader(title, delay);
        } else {
            typeHeader(title, delay, getDivider());
        }
    }

    private boolean dividerIsNull(){
        if(getDivider() == null) return true;

        return false;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public String getDivider() {
        return divider;
    }

    public void setDivider(String divider){
        this.divider = divider;
    }

    // ---------------------------------------------------------------------------------
    // -------------------------------- STATIC METHODS  --------------------------------
    // ---------------------------------------------------------------------------------

    /**
     * Writes a simplified header on the terminal, dividers are generated based on the title length,
     * The divider is approximately twice the length of the title
     *
     * @param title the header title
     */
    public static void header(String title){
        String separator = Divider.generateDivider(title);

        header(title, separator);
    }

    /**
     * Writes a simplified header to the terminal, the user have to instance the separator on this function.
     *
     * @param title the header title
     * @param separator the separator
     */
    public static void header(String title, String separator){
        System.out.println(separator);
        System.out.println(Title.generateCenterTitle(separator, title));
        System.out.println(separator);
    }

    /**
     * Writes a simplified header to the terminal with effect of typing
     * and the divider is approximately twice the length of the title.
     *
     * @param title the header title
     * @param delay the typing effect delay
     */
    public static void typeHeader(String title, int delay){
        String separator = Divider.generateDivider(title);

        Write.type(separator, delay);
        Write.type(Title.generateCenterTitle(separator, title), delay);
        Write.type(separator, delay);
    }

    /**
     * Writes a simplified header to the terminal with effect of typing
     * and the divider is approximately twice the length of the title.
     *
     * @param title the header title
     * @param delay the typing effect delay
     */
    public static void typeHeader(String title, int delay, String divider){
        Write.type(divider, delay);
        Write.type(Title.generateCenterTitle(divider, title), delay);
        Write.type(divider, delay);
    }

    /**
     * Writes a simplified header to the terminal; dividers are generated based on the title length,
     * and the divider is approximately twice the length of the title.
     *
     * The typing effect has the delay based on the WriteClass const
     *
     * @param title the header title
     */
    public static void typeHeader(String title){
        String separator = Divider.generateDivider(title);

        Write.type(separator);
        Write.type(Title.generateCenterTitle(separator, title));
        Write.type(separator);
    }

    /**
     * Writes a simplified header to the terminal; dividers are generated based on the title length,
     * and the divider is approximately twice the length of the title.
     *
     * The typing effect has the delay based on the WriteClass const
     *
     * @param title the header title
     */
    public static void typeHeader(String title, String divider){
        Write.type(divider);
        Write.type(Title.generateCenterTitle(divider, title));
        Write.type(divider);
    }

}
