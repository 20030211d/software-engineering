import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import xiaoyuankashenqing from '@/views/modules/xiaoyuankashenqing/list'
    import menjindengji from '@/views/modules/menjindengji/list'
    import xiaofeijilu from '@/views/modules/xiaofeijilu/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import yiliaojilu from '@/views/modules/yiliaojilu/list'
    import menu from '@/views/modules/menu/list'
    import xiaoyuankachongzhi from '@/views/modules/xiaoyuankachongzhi/list'
    import tushufenlei from '@/views/modules/tushufenlei/list'
    import xiaomen from '@/views/modules/xiaomen/list'
    import xiaoyuankazhuxiao from '@/views/modules/xiaoyuankazhuxiao/list'
    import tushujieyue from '@/views/modules/tushujieyue/list'
    import xiaoyuankapaifa from '@/views/modules/xiaoyuankapaifa/list'
    import tushuxinxi from '@/views/modules/tushuxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/xiaoyuankashenqing',
        name: '校园卡申请',
        component: xiaoyuankashenqing
      }
      ,{
	path: '/menjindengji',
        name: '门禁登记',
        component: menjindengji
      }
      ,{
	path: '/xiaofeijilu',
        name: '消费记录',
        component: xiaofeijilu
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/yiliaojilu',
        name: '医疗记录',
        component: yiliaojilu
      }
      ,{
	path: '/menu',
        name: '菜单列表',
        component: menu
      }
      ,{
	path: '/xiaoyuankachongzhi',
        name: '校园卡充值',
        component: xiaoyuankachongzhi
      }
      ,{
	path: '/tushufenlei',
        name: '图书分类',
        component: tushufenlei
      }
      ,{
	path: '/xiaomen',
        name: '校门',
        component: xiaomen
      }
      ,{
	path: '/xiaoyuankazhuxiao',
        name: '校园卡注销',
        component: xiaoyuankazhuxiao
      }
      ,{
	path: '/tushujieyue',
        name: '图书借阅',
        component: tushujieyue
      }
      ,{
	path: '/xiaoyuankapaifa',
        name: '校园卡派发',
        component: xiaoyuankapaifa
      }
      ,{
	path: '/tushuxinxi',
        name: '图书信息',
        component: tushuxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
