package persistence;


import domain.Sequence;

public interface SequanceDAO {
    Sequence getSequence(Sequence sequence);
    void updateSequence(Sequence sequence);
}
