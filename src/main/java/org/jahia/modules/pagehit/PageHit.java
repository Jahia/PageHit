package org.jahia.modules.pagehit;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Represents page hits entry.
 * User: Dorth
 */
@Entity
@Table(name = "jahia_pagehit")
public class PageHit implements Serializable{

    private static final long serialVersionUID = 636269287295922913L;
    private Long hits;
    private String path;
    private String uuid;


    public PageHit() {

    }

    public PageHit(Long hits, String path, String uuid) {
        this.hits = hits;
        this.path = path;
        this.uuid = uuid;
    }

    @Id
    @Column(length = 36)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    public Long getHits() {
        return hits;
    }

    public void setHits(Long hits) {
        this.hits = hits;
    }

    @Lob
    @Column (name = "page_path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
