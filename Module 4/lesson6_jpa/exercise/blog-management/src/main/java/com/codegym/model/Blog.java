package com.codegym.model;

import javax.persistence.*;

@Entity
@Table
public class Blog {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String header;
    private String summary;
    private String body;
    private String postDate;

    public Blog() {
    }

    public Blog(Long id, String header, String summary, String body, String postDate) {
        this.id = id;
        this.header = header;
        this.summary = summary;
        this.body = body;
        this.postDate = postDate;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", header='" + header + '\'' +
                ", summary='" + summary + '\'' +
                ", body='" + body + '\'' +
                ", postDate='" + postDate + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }
}
