package dto;

public class Describer {
    private String descr;
    private String regex;

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Describer describer = (Describer) o;

        if (descr != null ? !descr.equals(describer.descr) : describer.descr != null) return false;
        return regex != null ? regex.equals(describer.regex) : describer.regex == null;
    }

    @Override
    public int hashCode() {
        int result = descr != null ? descr.hashCode() : 0;
        result = 31 * result + (regex != null ? regex.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Describer{" +
                "descr='" + descr + '\'' +
                ", regex='" + regex + '\'' +
                '}';
    }
}
