insert into mall_source.ums_member_level (id, name, growth_point, default_status, free_freight_point, comment_growth_point, priviledge_free_freight, priviledge_sign_in, priviledge_comment, priviledge_promotion, priviledge_member_price, priviledge_birthday, note)
values  (1, '黄金会员', 1000, 0, 199.00, 5, 1, 1, 1, 1, 1, 1, null),
        (2, '白金会员', 5000, 0, 99.00, 10, 1, 1, 1, 1, 1, 1, null),
        (3, '钻石会员', 15000, 0, 69.00, 15, 1, 1, 1, 1, 1, 1, null),
        (4, '普通会员', 1, 1, 199.00, 20, 1, 1, 1, 1, 0, 0, null);