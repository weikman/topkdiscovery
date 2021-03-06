package sics.seiois.mlsserver.biz.der.metanome.input.partitions.clusters;

import java.util.List;
import java.util.stream.IntStream;

import mls.guava.common.collect.ImmutableList;

public class TupleIDProvider {

    private final List<Integer> tIDs;

    public TupleIDProvider(int size) {
        tIDs = IntStream.range(0, size).boxed().collect(ImmutableList.toImmutableList());
    }
    public TupleIDProvider(int start, int size) {
        tIDs = IntStream.range(start, start + size).boxed().collect(ImmutableList.toImmutableList());
    }
    public List<Integer> gettIDs() {
        return tIDs;
    }

}
