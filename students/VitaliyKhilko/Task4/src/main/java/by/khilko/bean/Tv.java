package by.khilko.bean;

import java.io.Serializable;
import java.util.Objects;

public class Tv implements Serializable{
    private String modelTv;
    private int channelTv;
    private int soundTv;
    private boolean worksTv;

    public Tv() {
    }

    public Tv(String modelTv, int channelTv, int soundTv, boolean worksTv) {
        this.modelTv = modelTv;
        this.channelTv = channelTv;
        this.soundTv = soundTv;
        this.worksTv = worksTv;
    }

    public String getModelTv() {
        return modelTv;
    }

    public void setModelTv(String modelTv) {
        this.modelTv = modelTv;
    }

    public int getChannelTv() {
        return channelTv;
    }

    public void setChannelTv(int channelTv) {
        this.channelTv = channelTv;
    }

    public int getSoundTv() {
        return soundTv;
    }

    public void setSoundTv(int soundTv) {
        this.soundTv = soundTv;
    }

    public boolean isWorksTv() {
        return worksTv;
    }

    public void setWorksTv(boolean worksTv) {
        this.worksTv = worksTv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tv)) return false;
        Tv tv = (Tv) o;
        return channelTv == tv.channelTv &&
                soundTv == tv.soundTv &&
                worksTv == tv.worksTv &&
                modelTv.equals(tv.modelTv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelTv, channelTv, soundTv, worksTv);
    }

    @Override
    public String toString() {
        return "TV{" +
                "modelTv='" + modelTv + '\'' +
                ", channelTv=" + channelTv +
                ", soundTv=" + soundTv +
                ", worksTv=" + worksTv +
                '}';
    }
}
