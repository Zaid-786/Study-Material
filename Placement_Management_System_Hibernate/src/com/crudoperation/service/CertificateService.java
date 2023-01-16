package com.crudoperation.service;

import com.crudoperation.entities.Certificate;

public interface CertificateService {
	Certificate findByCertificateId(int studentid);

	void addCertificate(Certificate certificate);

	void updateCertificate(Certificate certificate);

	void removeCertificate(Certificate certificate);

}