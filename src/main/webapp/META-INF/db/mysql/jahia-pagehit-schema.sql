
    drop table if exists jahia_pagehit;

    create table jahia_pagehit (
        uuid varchar(36) not null,
        hits bigint,
        page_path longtext,
        primary key (uuid)
    ) ENGINE=InnoDB;
