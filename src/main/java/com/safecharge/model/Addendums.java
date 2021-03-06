package com.safecharge.model;

import javax.validation.Valid;

/**
 * Copyright (C) 2007-2017 SafeCharge International Group Limited.
 * <p>
 * Container for additional domain specific payment info such as Airplane tickets data,
 * country's law specific payment data, etc.
 *
 * @author <a mailto:nikolad@safecharge.com>Nikola Dichev</a>
 * @since 2/14/2017
 */
public class Addendums {

    @Valid
    private AddendumsLocalPayment localPayment;

    public AddendumsLocalPayment getLocalPayment() {
        return localPayment;
    }

    public void setLocalPayment(AddendumsLocalPayment localPayment) {
        this.localPayment = localPayment;
    }

}
