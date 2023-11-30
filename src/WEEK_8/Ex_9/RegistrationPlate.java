package WEEK_8.Ex_9;

import java.util.Objects;

public class RegistrationPlate {
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String toString(){
        return country+ " "+regCode;
    }

    public String getCountry() {
        return this.country;
    }

    public String getRegCode() {
        return this.regCode;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if (!Objects.equals(this.country, compared.getCountry())) {
            return false;
        }

        return this.regCode != null && this.regCode.equals(compared.getRegCode());
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;

        result = prime * result + (country == null ? 0 : country.hashCode());
        result = prime * result + (regCode == null ? 0 : regCode.hashCode());

        return result;
    }
}
