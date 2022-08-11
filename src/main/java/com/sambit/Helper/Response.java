package com.sambit.Helper;

public class Response {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status='" + status + '\'' +
                '}';
    }
}
