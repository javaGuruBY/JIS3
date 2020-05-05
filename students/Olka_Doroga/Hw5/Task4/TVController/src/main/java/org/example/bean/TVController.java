package org.example.bean;

import java.util.Objects;

public class TVController implements Serializable {
    private boolean connectedTv = false;

    public TVController() {
    }

    public TVController(boolean connectedTv) {
        this.connectedTv = connectedTv;
    }

    public boolean isConnectedTv() {
        return connectedTv;
    }

    public void setConnectedTv(boolean connectedTv) {
        this.connectedTv = connectedTv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TVController that = (TVController) o;
        return connectedTv == that.connectedTv;
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectedTv);
    }

    @Override
    public String toString() {
        return "TVController{" +
                "connectedTv=" + connectedTv +
                '}';
    }
}
