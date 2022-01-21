package org.iesfm.library;

import java.util.Objects;

public class Member {

    private String nif;
    private String name;
    private String lastName;
    private int numberMember;
    private int postalCode;

    public Member(String nif, String name, String lastName, int numberMember, int postalCode) {
        this.nif = nif;
        this.name = name;
        this.lastName = lastName;
        this.numberMember = numberMember;
        this.postalCode = postalCode;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberMember() {
        return numberMember;
    }

    public void setNumberMember(int numberMember) {
        this.numberMember = numberMember;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return numberMember == member.numberMember && postalCode == member.postalCode && Objects.equals(nif, member.nif) && Objects.equals(name, member.name) && Objects.equals(lastName, member.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, lastName, numberMember, postalCode);
    }

    @Override
    public String toString() {
        return "org.iesfm.library.Member{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numberMember=" + numberMember +
                ", postalCode=" + postalCode +
                '}';
    }
}
