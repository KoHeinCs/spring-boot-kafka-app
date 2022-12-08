package com.ashwetaw.kafka.config;

import org.springframework.util.ObjectUtils;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.Instant;


public class AuditListener {
    @PrePersist
    public void setCreated(Object object) {
        if (object instanceof IAudit) {
            IAudit iAudit = (IAudit) object;
            Audit audit = iAudit.getAudit();
            if (ObjectUtils.isEmpty(audit)) {
                audit = new Audit();
                iAudit.setAudit(audit);
            }
            audit.setCreatedDate(Instant.now());
            audit.setCreatedBy(getUsername());
        }
    }

    @PreUpdate
    public void setUpdated(Object object){
        if (object instanceof IAudit) {
            IAudit iAudit = (IAudit) object;
            Audit audit = iAudit.getAudit();
            if (ObjectUtils.isEmpty(audit)) {
                audit = new Audit();
                iAudit.setAudit(audit);
            }
            audit.setUpdatedDate(Instant.now());
            audit.setUpdatedBy(getUsername());
        }
    }

    private String getUsername(){
        // TODO after security configuration , get user from security
        return "System";
    }
}
