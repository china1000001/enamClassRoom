public enum DAY {
    MONDAY("himiya,N.V.P,himiya,algebry,fizicheskoy-podgotovki,k.tili = 6 urokov"),
    TUESDAY("fizicheskoy-podgotovki,k.tili,himiya,N.V.P,himiya,algebry = 6 urokov"),
    WEDNESDAY("algebry,fizicheskoy-podgotovki,k.tili,himiya,N.V.P,algebry = 6 urokov"),
    THURSDAY("fiziki,himiya,N.V.P,himiya,algebry,fizicheskoy-podgotovki,k.tili = 6 urokov"),
    FRIDAY("fizicheskoy-podgotovki,himiya,N.V.P,himiya,algebry = 5 urokov");
    private String day;
    DAY(String day) {
        this.day = day;
    }
    @Override
    public String toString() {
        return
                "DAY= " + day ;
    }
}
