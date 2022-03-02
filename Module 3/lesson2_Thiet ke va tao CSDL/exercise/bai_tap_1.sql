create schema quan_ly_vat_tu;
use quan_ly_vat_tu;

create table vat_tu(
ma_vat_tu int auto_increment primary key,
ten_vat_tu varchar(30) not null
);

create table phieu_xuat(
so_phieu_xuat int auto_increment primary key,
ngay_xuat date not null
);

create table chi_tiet_phieu_xuat(
don_gia_xuat double not null,
so_luong_xuat int not null,
so_phieu_xuat int,
ma_vat_tu int,
primary key (so_phieu_xuat, ma_vat_tu),
foreign key (so_phieu_xuat) references phieu_xuat(so_phieu_xuat),
foreign key (ma_vat_tu) references vat_tu (ma_vat_tu)
);

create table phieu_nhap(
so_phieu_nhap int auto_increment primary key,
ngay_nhap date not null
);

create table chi_tiet_phieu_nhap(
don_gia_nhap double not null,
so_luong_nhap int not null,
so_phieu_nhap int,
ma_vat_tu int,
primary key (so_phieu_nhap, ma_vat_tu),
foreign key (so_phieu_nhap) references phieu_nhap(so_phieu_nhap),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table don_dat_hang(
so_don_hang int auto_increment primary key,
ngay_dat_hang date not null
);

create table chi_tiet_don_dat_hang(
ma_vat_tu int,
so_don_hang int,
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key (so_don_hang) references don_dat_hang (so_don_hang)
);

create table nha_cung_cap(
ma_nha_cung_cap int auto_increment primary key,
ten_nha_cung_cap varchar(50) not null,
dia_chi varchar(50) not null
);

create table so_dien_thoai(
so_dien_thoai varchar(15) not null,
ma_nha_cung_cap int,
foreign key (ma_nha_cung_cap) references nha_cung_cap (ma_nha_cung_cap)
);