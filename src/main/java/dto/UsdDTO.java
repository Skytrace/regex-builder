package dto;

import java.util.ArrayList;

public class UsdDTO {
    private ArrayList<Describer> buy;
    private ArrayList<Describer> sell;

    public ArrayList<Describer> getBuy() {
        return buy;
    }

    public void setBuy(ArrayList<Describer> buy) {
        this.buy = buy;
    }

    public ArrayList<Describer> getSell() {
        return sell;
    }

    public void setSell(ArrayList<Describer> sell) {
        this.sell = sell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsdDTO usdDTO = (UsdDTO) o;

        if (buy != null ? !buy.equals(usdDTO.buy) : usdDTO.buy != null) return false;
        return sell != null ? sell.equals(usdDTO.sell) : usdDTO.sell == null;
    }

    @Override
    public int hashCode() {
        int result = buy != null ? buy.hashCode() : 0;
        result = 31 * result + (sell != null ? sell.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UsdDTO{" +
                "buy=" + buy +
                ", sell=" + sell +
                '}';
    }
}
