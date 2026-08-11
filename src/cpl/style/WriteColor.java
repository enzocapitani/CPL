package cpl.style;

/**
* Enum for colors in WriteColor, the values return ANSI codes that the terminal can read.
*/
public enum WriteColor {
    
    // Calling this reverts it to the original color.
    RESET("\u001B[0m"),

    // Cores padrão
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),

    // Bright colors
    BRIGHT_BLACK("\u001B[90m"),
    BRIGHT_RED("\u001B[91m"),
    BRIGHT_GREEN("\u001B[92m"),
    BRIGHT_YELLOW("\u001B[93m"),
    BRIGHT_BLUE("\u001B[94m"),
    BRIGHT_PURPLE("\u001B[95m"),
    BRIGHT_CYAN("\u001B[96m"),
    BRIGHT_WHITE("\u001B[97m");

    private final String ansi;

    private WriteColor(String ansi){
        this.ansi = ansi;
    }
    
    // Overriding toString to simplify writing the enum.
    @Override
    public String toString(){
        return ansi;
    }

}
