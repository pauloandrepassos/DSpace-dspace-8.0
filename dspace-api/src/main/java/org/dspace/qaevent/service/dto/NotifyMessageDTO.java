/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.qaevent.service.dto;

/**
 * Implementation of {@link QAMessageDTO} that model message coming from COAR NOTIFY.
 *
 * @author Francesco Bacchelli (francesco.bacchelli at 4science.it)
 *
 */
public class NotifyMessageDTO implements QAMessageDTO {

    private String serviceName;

    private String serviceId;

    private String href;

    private String relationship;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

}
