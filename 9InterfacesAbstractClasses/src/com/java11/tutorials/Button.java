package com.java11.tutorials;

public class Button {
    private String name;
    private IOnClickListener onClickListener;

    public Button(String name) {
        this.name = name;
    }

    public void setOnClickListener(IOnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        onClickListener.onClick(name);
    }

    public interface IOnClickListener {
        void onClick(String title);
    }
}
