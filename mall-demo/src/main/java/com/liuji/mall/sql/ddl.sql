create table test.brand
(
    id bigint auto_increment
        primary key,
    name varchar(64) null comment '名称',
    first_letter varchar(8) null comment '首字母',
    sort int null comment '排序',
    factory_status int null comment '是否为品牌制造商: 0-->不是 1-->是',
    show_status int null comment '是否显示',
    product_count int null comment '产品数量',
    product_comment_count int null comment '产品评价数量',
    logo varchar(255) null comment '品牌logo',
    big_pic varchar(255) null comment '大图',
    brand_story text null comment '品牌故事'
);
create table test.cart_item
(
    id bigint auto_increment
        primary key,
    product_id bigint null comment '商品id',
    product_sku_id bigint null comment '商品sku id',
    member_id bigint null comment '会员id',
    quantity int null comment '购买数量',
    price decimal(10,2) null comment '添加到购物车的价格',
    sp1 varchar(200) null comment '销售属性1',
    sp2 varchar(200) null comment '销售属性2',
    sp3 varchar(200) null comment '销售属性3',
    product_pic varchar(1000) null comment '商品主图',
    product_name varchar(500) null comment '商品名称',
    product_brand varchar(200) null comment '商品品牌',
    product_sn varchar(200) null comment '商品的条码',
    product_sub_title varchar(500) null comment '商品副标题（卖点）',
    product_sku_code varchar(200) null comment '商品sku条码',
    member_nickname varchar(500) null comment '会员昵称',
    create_date datetime null comment '创建时间',
    modify_date datetime null comment '修改时间',
    delete_status int default 0 null comment '是否删除',
    product_category_id bigint null comment '商品的分类',
    product_attr varchar(500) null comment '商品销售属性:[{},{}]'
);
create table test.comment
(
    id bigint auto_increment
        primary key,
    product_id bigint null comment '商品id',
    member_nick_name varchar(255) null comment '会员昵称',
    product_name varchar(255) null comment '商品名称',
    star int null comment '评价星数 0-5',
    member_ip varchar(64) null comment '评价的ip',
    create_time datetime null comment '创建时间',
    show_status int null comment '是否显示',
    product_attribute varchar(255) null comment '购买时的产品属性',
    collect_count int null comment '收藏数',
    read_count int null comment '阅读数',
    content text null comment '内容',
    pics varchar(1000) null comment '上传图片的地址,以,隔开',
    member_icon varchar(255) null comment '用户图标',
    replay_count int null comment '回复数'
);

create table test.comment_replay
(
    id bigint auto_increment
        primary key,
    comment_id bigint null comment '评论id',
    member_nick_name varchar(255) null comment '会员昵称',
    member_icon varchar(255) null comment '会员头像',
    content text null comment '内容',
    create_time datetime null comment '创建时间',
    type int null comment '评论人的类型 0--> member 1--> admin'
);

create table test.company_address
(
    id bigint auto_increment
        primary key,
    address_name varchar(200) null comment '地址名称',
    send_status int null comment '默认发货地址：0->否；1->是',
    receive_status int null comment '是否默认收货地址：0->否；1->是',
    name varchar(64) null comment '收发货人姓名',
    phone varchar(64) null comment '收货人电话',
    province varchar(64) null comment '省/直辖市',
    city varchar(64) null comment '市',
    region varchar(64) null comment '区',
    detail_address varchar(200) null comment '详细地址'
);

create table test.coupon
(
    id bigint auto_increment
        primary key,
    type int null comment '优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券',
    name varchar(100) null comment '名称',
    platform int null comment '使用平台：0->全部；1->移动；2->PC',
    count int null comment '数量',
    amount decimal(10,2) null comment '金额',
    per_limit int null comment '每人限领张数',
    min_point decimal(10,2) null comment '使用门槛, 0表示无门槛',
    start_time datetime null comment '开始使用时间',
    end_time datetime null comment '结束使用时间',
    use_type int null comment '使用类型：0->全场通用；1->指定分类；2->指定商品',
    note varchar(200) null comment '备注',
    publish_count int null comment '发行数量',
    use_count int null comment '使用数量',
    receive_count int null comment '领取数量',
    enable_time datetime null comment '可领取日期',
    code varchar(64) null comment '优惠码',
    member_level int null comment '可领取的会员类型：0->无限制'
);

create table test.coupon_history
(
    id bigint auto_increment
        primary key,
    coupon_id bigint null comment '优惠券id',
    member_id bigint null comment '会员id',
    order_id bigint null comment '订单id',
    coupon_code varchar(64) null comment '优惠券码',
    member_nickname varchar(64) null comment '领取人昵称',
    get_type int null comment '获取类型：0->后台赠送；1->主动获取',
    create_time datetime null comment '创建时间',
    use_status int null comment '使用状态：0->未使用；1->已使用；2->已过期',
    use_time datetime null comment '使用时间',
    order_sn varchar(100) null comment '订单号码'
);

create table test.coupon_product_category_relation
(
    id bigint auto_increment
        primary key,
    coupon_id bigint null comment '优惠券id',
    product_category_id bigint null comment '商品分类id',
    product_category_name varchar(200) null comment '商品分类名称',
    parent_category_name varchar(200) null comment '父类名称'
);


create table test.coupon_product_relation
(
    id bigint auto_increment
        primary key,
    coupon_id bigint null comment '优惠券id',
    product_id bigint null comment '商品id',
    product_name varchar(500) null comment '商品名称',
    product_sn varchar(200) null comment '商品条码'
);


create table test.flash_promotion
(
    id bigint auto_increment
        primary key,
    title varchar(200) null comment '标题',
    start_date date null comment '开始日期',
    end_date date null comment '结束日期',
    status int null comment '上线下线状态',
    create_time datetime null comment '创建时间'
);

create table test.flash_promotion_log
(
    id bigint auto_increment
        primary key,
    member_id bigint null comment '会员id',
    member_phone varchar(64) null comment '会员电话',
    product_id bigint null comment '商品id',
    product_name varchar(100) null comment '商品名称',
    subscribe_time datetime null comment '会员订阅时间',
    send_time datetime null comment '发送时间'
);

create table test.flash_promotion_product_relation
(
    id bigint auto_increment
        primary key,
    flash_promotion_id bigint null comment '限时购id',
    flash_promotion_session_id bigint null comment '场次id',
    product_id bigint null comment '商品id',
    flash_promotion_price decimal(10,2) null comment '限时购价格',
    flash_promotion_count int null comment '限时购数量',
    flash_promotion_person_limit int null comment '每人限购数量',
    sort int null comment '排序'
);

create table test.flash_promotion_session
(
    id bigint auto_increment
        primary key,
    name varchar(200) null comment '场次名称',
    start_time time null comment '每日开始时间',
    end_time time null comment '每日结束时间',
    status int null comment '启用状态: 0-->不启用,1-->启用',
    create_time datetime null comment '创建时间'
);

create table test.home_advertise
(
    id bigint auto_increment
        primary key,
    name varchar(100) null comment '名称',
    type int null comment '轮播位置：0->PC首页轮播；1->app首页轮播',
    pic varchar(500) null comment '图片地址',
    start_time datetime null comment '开始时间',
    end_time datetime null comment '结束时间',
    status int null comment '上下线状态：0->下线；1->上线',
    click_count int null comment '点击数',
    order_count int null comment '下单数',
    url varchar(500) null comment '链接地址',
    note varchar(500) null comment '备注',
    sort int default 0 null comment '排序'
);

create table test.home_brand
(
    id bigint auto_increment
        primary key,
    brand_id bigint null comment '品牌id',
    brand_name varchar(64) null comment '品牌名称',
    recommend_status int null comment '推荐状态：0->不推荐;1->推荐',
    sort int null
);

create table test.home_new_product
(
    id bigint auto_increment
        primary key,
    product_id bigint null comment '商品id',
    product_name varchar(64) null comment '商品名称',
    recommend_status int null comment '推荐状态：0->不推荐;1->推荐',
    sort int null comment '排序'
);

create table test.home_recommend_product
(
    id bigint auto_increment
        primary key,
    product_id bigint null comment '商品id',
    product_name varchar(64) null comment '商品名称',
    recommend_status int null comment '推荐状态：0->不推荐;1->推荐',
    sort int null comment '排序'
);

create table test.home_recommend_subject
(
    id bigint auto_increment
        primary key,
    subject_id bigint null comment '专题id',
    subject_name varchar(64) null comment '专题名称',
    recommend_status int null comment '推荐状态：0->不推荐;1->推荐',
    sort int null comment '排序'
);

create table test.mall_user
(
    id bigint not null
        primary key,
    username varchar(64) charset utf8mb4 null,
    password varchar(64) charset utf8mb4 null,
    icon varchar(500) charset utf8mb4 null,
    email varchar(100) charset utf8mb4 null,
    nick_name varchar(200) charset utf8mb4 null,
    note varchar(500) charset utf8mb4 null,
    create_time datetime null,
    login_time datetime null,
    status int default 1 null
)
    charset=utf8;

create table test.member_price
(
    id bigint auto_increment
        primary key,
    product_id bigint null,
    member_level_id bigint null,
    member_price decimal(10,2) null comment '会员价格',
    member_level_name varchar(100) null
)
    comment '商品会员价格表' charset=utf8;


create table test.order_item
(
    id bigint auto_increment
        primary key,
    order_id bigint null comment '订单id',
    order_sn varchar(64) null comment '订单编号',
    product_id bigint null,
    product_pic varchar(500) null,
    product_name varchar(200) null,
    product_brand varchar(200) null,
    product_sn varchar(64) null,
    product_price decimal(10,2) null comment '销售价格',
    product_quantity int null comment '购买数量',
    product_sku_id bigint null comment '商品sku编号',
    product_sku_code varchar(50) null comment '商品sku条码',
    product_category_id bigint null comment '商品分类id',
    sp1 varchar(100) null comment '商品的销售属性',
    sp2 varchar(100) null,
    sp3 varchar(100) null,
    promotion_name varchar(200) null comment '商品促销名称',
    promotion_amount decimal(10,2) null comment '商品促销分解金额',
    coupon_amount decimal(10,2) null comment '优惠券优惠分解金额',
    integration_amount decimal(10,2) null comment '积分优惠分解金额',
    real_amount decimal(10,2) null comment '该商品经过优惠后的分解金额',
    gift_integration int default 0 null,
    gift_growth int default 0 null,
    product_attr varchar(500) null comment '商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]'
)
    comment '订单中所包含的商品' charset=utf8;

create table test.order_operate_history
(
    id bigint auto_increment
        primary key,
    order_id bigint null comment '订单id',
    operate_man varchar(100) null comment '操作人',
    create_time datetime null comment '操作时间',
    order_status int null comment '订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单',
    note varchar(500) null comment '备注'
);

create table test.order_return_apply
(
    id bigint auto_increment
        primary key,
    order_id bigint null comment '订单id',
    company_address_id bigint null comment '收货地址表id',
    product_id bigint null comment '退货商品id',
    order_sn varchar(64) null comment '订单编号',
    create_time datetime null comment '申请时间',
    member_username varchar(64) null comment '会员用户名',
    return_amount decimal(10,2) null comment '退款金额',
    return_name varchar(100) null comment '退货人姓名',
    return_phone varchar(100) null comment '退货人电话',
    status int null comment '申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝',
    handle_time datetime null comment '处理时间',
    product_pic varchar(500) null comment '商品图片',
    product_name varchar(200) null comment '商品名称',
    product_brand varchar(200) null comment '商品品牌',
    product_attr varchar(500) null comment '商品销售属性：颜色：红色；尺码：xl;',
    product_count int null comment '退货数量',
    product_price decimal(10,2) null comment '商品单价',
    product_real_price decimal(10,2) null comment '商品实际支付单价',
    reason varchar(200) null comment '原因',
    description varchar(500) null comment '描述',
    proof_pics varchar(1000) null comment '凭证图片，以逗号隔开',
    handle_note varchar(500) null comment '处理备注',
    handle_man varchar(100) null comment '处理人员',
    receive_man varchar(100) null comment '收货人',
    receive_time datetime null comment '收货时间',
    receive_note varchar(500) null comment '收货备注'
);

create table test.order_return_reason
(
    id bigint auto_increment
        primary key,
    name varchar(100) null comment '退货类型',
    sort int null,
    status int null comment '状态：0-->不启用 1-->启动',
    create_time datetime null comment '添加时间'
);

create table test.order_setting
(
    id bigint auto_increment
        primary key,
    flash_order_overtime int null comment '秒杀订单超时关闭时间（分）',
    normal_order_overtime int null comment '正常订单超时时间(分）',
    confirm_overtime int null comment '发货后自动确认收获时间(天)',
    finish_overtime int null comment '自动完成订单时间,不能申请售后(天)',
    comment_overtime int null comment '自动好评时间(天)'
);

create table test.orders
(
    id bigint auto_increment comment '订单id'
        primary key,
    member_id bigint not null,
    coupon_id bigint null,
    order_sn varchar(64) null comment '订单编号',
    create_time datetime null comment '提交时间',
    member_username varchar(64) null comment '用户帐号',
    total_amount decimal(10,2) null comment '订单总金额',
    pay_amount decimal(10,2) null comment '应付金额（实际支付金额）',
    freight_amount decimal(10,2) null comment '运费金额',
    promotion_amount decimal(10,2) null comment '促销优化金额（促销价、满减、阶梯价）',
    integration_amount decimal(10,2) null comment '积分抵扣金额',
    coupon_amount decimal(10,2) null comment '优惠券抵扣金额',
    discount_amount decimal(10,2) null comment '管理员后台调整订单使用的折扣金额',
    pay_type int null comment '支付方式：0->未支付；1->支付宝；2->微信',
    source_type int null comment '订单来源：0->PC订单；1->app订单',
    status int null comment '订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单',
    order_type int null comment '订单类型：0->正常订单；1->秒杀订单',
    delivery_company varchar(64) null comment '物流公司(配送方式)',
    delivery_sn varchar(64) null comment '物流单号',
    auto_confirm_day int null comment '自动确认时间（天）',
    integration int null comment '可以获得的积分',
    growth int null comment '可以活动的成长值',
    promotion_info varchar(100) null comment '活动信息',
    bill_type int null comment '发票类型：0->不开发票；1->电子发票；2->纸质发票',
    bill_header varchar(200) null comment '发票抬头',
    bill_content varchar(200) null comment '发票内容',
    bill_receiver_phone varchar(32) null comment '收票人电话',
    bill_receiver_email varchar(64) null comment '收票人邮箱',
    receiver_name varchar(100) not null comment '收货人姓名',
    receiver_phone varchar(32) not null comment '收货人电话',
    receiver_post_code varchar(32) null comment '收货人邮编',
    receiver_province varchar(32) null comment '省份/直辖市',
    receiver_city varchar(32) null comment '城市',
    receiver_region varchar(32) null comment '区',
    receiver_detail_address varchar(200) null comment '详细地址',
    note varchar(500) null comment '订单备注',
    confirm_status int null comment '确认收货状态：0->未确认；1->已确认',
    delete_status int default 0 not null comment '删除状态：0->未删除；1->已删除',
    use_integration int null comment '下单时使用的积分',
    payment_time datetime null comment '支付时间',
    delivery_time datetime null comment '发货时间',
    receive_time datetime null comment '确认收货时间',
    comment_time datetime null comment '评价时间',
    modify_time datetime null comment '修改时间'
)
    comment '订单表' charset=utf8;

create table test.preference_area
(
    id bigint auto_increment
        primary key,
    name varchar(255) null,
    sub_title varchar(255) null,
    pic varbinary(500) null comment '展示图片',
    sort int null,
    show_status int null
)
    comment '优选专区' charset=utf8;

create table test.preference_area_product_relation
(
    id bigint auto_increment
        primary key,
    preference_area_id bigint null,
    product_id bigint null
)
    comment '优选专区和产品关系表' charset=utf8;

create table test.product
(
    id bigint auto_increment
        primary key,
    brand_id bigint null,
    product_category_id bigint null,
    feight_template_id bigint null,
    product_attribute_category_id bigint null,
    name varchar(64) not null,
    pic varchar(255) null,
    product_sn varchar(64) not null comment '货号',
    delete_status int null comment '删除状态：0->未删除；1->已删除',
    publish_status int null comment '上架状态：0->下架；1->上架',
    new_status int null comment '新品状态:0->不是新品；1->新品',
    recommand_status int null comment '推荐状态；0->不推荐；1->推荐',
    verify_status int null comment '审核状态：0->未审核；1->审核通过',
    sort int null comment '排序',
    sale int null comment '销量',
    price decimal(10,2) null,
    promotion_price decimal(10,2) null comment '促销价格',
    gift_growth int default 0 null comment '赠送的成长值',
    gift_point int default 0 null comment '赠送的积分',
    use_point_limit int null comment '限制使用的积分数',
    sub_title varchar(255) null comment '副标题',
    description text null comment '商品描述',
    original_price decimal(10,2) null comment '市场价',
    stock int null comment '库存',
    low_stock int null comment '库存预警值',
    unit varchar(16) null comment '单位',
    weight decimal(10,2) null comment '商品重量，默认为克',
    preview_status int null comment '是否为预告商品：0->不是；1->是',
    service_ids varchar(64) null comment '以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮',
    keywords varchar(255) null,
    note varchar(255) null,
    album_pics varchar(255) null comment '画册图片，连产品图片限制为5张，以逗号分割',
    detail_title varchar(255) null,
    detail_desc text null,
    detail_html text null comment '产品详情网页内容',
    detail_mobile_html text null comment '移动端网页详情',
    promotion_start_time datetime null comment '促销开始时间',
    promotion_end_time datetime null comment '促销结束时间',
    promotion_per_limit int null comment '活动限购数量',
    promotion_type int null comment '促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购',
    brand_name varchar(255) null comment '品牌名称',
    product_category_name varchar(255) null comment '商品分类名称'
)
    comment '商品信息' charset=utf8;

create table test.product_attribute
(
    id bigint auto_increment
        primary key,
    product_attribute_category_id bigint null,
    name varchar(64) null,
    select_type int null comment '属性选择类型：0->唯一；1->单选；2->多选',
    input_type int null comment '属性录入方式：0->手工录入；1->从列表中选取',
    input_list varchar(255) null comment '可选值列表，以逗号隔开',
    sort int null comment '排序字段：最高的可以单独上传图片',
    filter_type int null comment '分类筛选样式：1->普通；1->颜色',
    search_type int null comment '检索类型；0->不需要进行检索；1->关键字检索；2->范围检索',
    related_status int null comment '相同属性产品是否关联；0->不关联；1->关联',
    hand_add_status int null comment '是否支持手动新增；0->不支持；1->支持',
    type int null comment '属性的类型；0->规格；1->参数'
)
    comment '商品属性参数表' charset=utf8;

create table test.product_attribute_category
(
    id bigint auto_increment
        primary key,
    name varchar(64) null comment '名称',
    attribute_count int null comment '属性数量',
    param_count int null comment '参数数量'
);

create table test.product_attribute_value
(
    id bigint auto_increment
        primary key,
    product_id bigint null,
    product_attribute_id bigint null,
    value varchar(64) null comment '手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开'
)
    comment '存储产品参数信息的表' charset=utf8;

create table test.product_category
(
    id bigint auto_increment
        primary key,
    parent_id bigint null comment '上级分类的编号,0表示一级分类',
    name varchar(64) null comment '名称',
    level int null comment '分类级别: 0表示1级 1表示2级',
    product_count int null comment '商品数量',
    product_unit varchar(64) null comment '商品单位',
    nav_status int null comment '是否显示在导航栏 0-->不显示  1-->显示',
    show_status int null comment '显示状态 0-->不显示  1-->显示',
    sort int null comment '排序',
    icon varchar(255) null,
    keywords varchar(255) null,
    description text null
);

create table test.product_category_attribute_relation
(
    id bigint auto_increment
        primary key,
    product_category_id bigint null comment '商品分类id',
    product_attribute_id bigint null comment '商品属性id'
);

create table test.product_full_reduction
(
    id bigint auto_increment
        primary key,
    product_id bigint null comment '商品id',
    full_price decimal(10,2) null comment '商品满足金额',
    reduce_price decimal(10,2) null comment '商品减少金额'
);

create table test.product_ladder
(
    id bigint auto_increment
        primary key,
    product_id bigint null comment '商品id',
    count int null comment '满足打折的商品数量',
    discount decimal(10,2) null comment '折扣',
    price decimal(10,2) null comment '折后价格'
);

create table test.product_operate_log
(
    id bigint auto_increment
        primary key,
    product_id bigint null comment '商品id',
    price_old decimal(10,2) null comment '改变前的价格',
    price_new decimal(10,2) null comment '改变后的价格',
    sale_price_old decimal(10,2) null comment '改变前的优惠价格',
    sale_price_new decimal(10,2) null comment '改变后的优惠价格',
    gift_point_old int null comment '改变前的积分',
    gift_point_new int null comment '改变后的积分',
    use_point_limit_old int null comment '改变前积分使用限制',
    use_point_limit_new int null comment '改变后积分使用限制',
    operate_man varchar(64) null comment '操作人',
    create_time datetime null comment '创建时间'
);

create table test.product_verify_record
(
    id bigint auto_increment
        primary key,
    product_id bigint null comment '商品id',
    create_time datetime null comment '创建时间',
    verify_man varchar(64) null comment '审核人',
    status int null comment '审核后的状态 0-->未通过 1-->通过',
    detail varchar(255) null comment '反馈详情'
);

create table test.sku_stock
(
    id bigint auto_increment
        primary key,
    product_id bigint null,
    sku_code varchar(64) not null comment 'sku编码',
    price decimal(10,2) null,
    stock int default 0 null comment '库存',
    low_stock int null comment '预警库存',
    pic varchar(255) null comment '展示图片',
    sale int null comment '销量',
    promotion_price decimal(10,2) null comment '单品促销价格',
    lock_stock int default 0 null comment '锁定库存',
    sp_data varchar(200) null
)
    comment 'sku的库存' charset=utf8;

create table test.subject
(
    id bigint auto_increment
        primary key,
    category_id bigint null,
    title varchar(100) null,
    pic varchar(500) null comment '专题主图',
    product_count int null comment '关联产品数量',
    recommend_status int null,
    create_time datetime null,
    collect_count int null,
    read_count int null,
    comment_count int null,
    album_pics varchar(1000) null comment '画册图片用逗号分割',
    description varchar(1000) null,
    show_status int null comment '显示状态：0->不显示；1->显示',
    content text null,
    forward_count int null comment '转发数',
    category_name varchar(200) null comment '专题分类名称'
)
    comment '专题表' charset=utf8;

create table test.subject_category
(
    id bigint auto_increment
        primary key,
    name varchar(100) null,
    icon varchar(500) null comment '分类图标',
    subject_count int null comment '专题数量',
    show_status int null,
    sort int null
)
    comment '专题分类表' charset=utf8;

create table test.subject_product_relation
(
    id bigint auto_increment
        primary key,
    subject_id bigint null,
    product_id bigint null
)
    comment '专题商品关系表' charset=utf8;

