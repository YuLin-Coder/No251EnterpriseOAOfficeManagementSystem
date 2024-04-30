
var projectName = '企业OA办公系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '公司公告',
	url: './pages/gongsigonggao/list.html'
}, 
{
	name: '公司活动',
	url: './pages/gongsihuodong/list.html'
}, 

{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssmp302b/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","工资"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"人事","menuJump":"列表","tableName":"renshi"}],"menu":"人事管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"公司公告","menuJump":"列表","tableName":"gongsigonggao"}],"menu":"公司公告管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"员工请假","menuJump":"列表","tableName":"yuangongqingjia"}],"menu":"员工请假管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"体温上报","menuJump":"列表","tableName":"tiwenshangbao"}],"menu":"体温上报管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"设备申请","menuJump":"列表","tableName":"shebeishenqing"}],"menu":"设备申请管理"},{"child":[{"buttons":["查看","修改","删除","打印"],"menu":"员工工资","menuJump":"列表","tableName":"yuangonggongzi"}],"menu":"员工工资管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"公司活动","menuJump":"列表","tableName":"gongsihuodong"}],"menu":"公司活动管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"投诉监督","menuJump":"列表","tableName":"tousujiandu"}],"menu":"投诉监督管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"申请经费","menuJump":"列表","tableName":"shenqingjingfei"}],"menu":"申请经费管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"客服管理","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"公司公告列表","menuJump":"列表","tableName":"gongsigonggao"}],"menu":"公司公告模块"},{"child":[{"buttons":["查看","报名"],"menu":"公司活动列表","menuJump":"列表","tableName":"gongsihuodong"}],"menu":"公司活动模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"员工请假","menuJump":"列表","tableName":"yuangongqingjia"}],"menu":"员工请假管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"体温上报","menuJump":"列表","tableName":"tiwenshangbao"}],"menu":"体温上报管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"设备申请","menuJump":"列表","tableName":"shebeishenqing"}],"menu":"设备申请管理"},{"child":[{"buttons":["查看","删除","打印"],"menu":"员工工资","menuJump":"列表","tableName":"yuangonggongzi"}],"menu":"员工工资管理"},{"child":[{"buttons":["查看"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"投诉监督","menuJump":"列表","tableName":"tousujiandu"}],"menu":"投诉监督管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"公司公告列表","menuJump":"列表","tableName":"gongsigonggao"}],"menu":"公司公告模块"},{"child":[{"buttons":["查看","报名"],"menu":"公司活动列表","menuJump":"列表","tableName":"gongsihuodong"}],"menu":"公司活动模块"}],"roleName":"员工","tableName":"yuangong"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除","工资"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"公司公告","menuJump":"列表","tableName":"gongsigonggao"}],"menu":"公司公告管理"},{"child":[{"buttons":["查看","审核","修改","删除"],"menu":"员工请假","menuJump":"列表","tableName":"yuangongqingjia"}],"menu":"员工请假管理"},{"child":[{"buttons":["查看"],"menu":"体温上报","menuJump":"列表","tableName":"tiwenshangbao"}],"menu":"体温上报管理"},{"child":[{"buttons":["查看","审核","删除","修改"],"menu":"设备申请","menuJump":"列表","tableName":"shebeishenqing"}],"menu":"设备申请管理"},{"child":[{"buttons":["查看","修改","删除","打印"],"menu":"员工工资","menuJump":"列表","tableName":"yuangonggongzi"}],"menu":"员工工资管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"公司活动","menuJump":"列表","tableName":"gongsihuodong"}],"menu":"公司活动管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"申请经费","menuJump":"列表","tableName":"shenqingjingfei"}],"menu":"申请经费管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"客服管理","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"公司公告列表","menuJump":"列表","tableName":"gongsigonggao"}],"menu":"公司公告模块"},{"child":[{"buttons":["查看","报名"],"menu":"公司活动列表","menuJump":"列表","tableName":"gongsihuodong"}],"menu":"公司活动模块"}],"roleName":"人事","tableName":"renshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
