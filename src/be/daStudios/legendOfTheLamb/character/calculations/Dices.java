package be.daStudios.legendOfTheLamb.character.calculations;

public enum Dices {
    D2(2),
    D4(4),
    D6(6),
    D8(8),
    D10(10),
    D12(12),
    D20(20),
    D100(100);

    public final int maxThrow;

    private Dices(int maxThrow) {
        this.maxThrow = maxThrow;


    }
}
