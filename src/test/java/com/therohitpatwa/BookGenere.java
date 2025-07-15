package com.therohitpatwa;

public enum BookGenere {
    FICTION("Fiction"),NON_FICTION("Non-Fiction"),PROGRAMMING("Programming"),BIOGRAPHY("Biography"),CLASSIC("classic"),SCIENCE("Science"),ADVENTURE("adventure");
    private String name;
    BookGenere(String name)
    {
        this.name=name;
    }


}
