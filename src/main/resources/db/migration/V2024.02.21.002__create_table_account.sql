CREATE TABLE account
(
    id_account character varying(36) NOT NULL,
    tx_name character varying(256) NOT NULL,
    tx_email character varying(256) NOT NULL,
    tx_hash character varying(256) NOT NULL,
    CONSTRAINT account_pkey PRIMARY KEY (id_account)
);
