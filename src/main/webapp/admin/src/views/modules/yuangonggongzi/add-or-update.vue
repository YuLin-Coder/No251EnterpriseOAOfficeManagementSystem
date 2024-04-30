<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row>
                        <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="员工姓名" prop="yuangongxingming">
          <el-input v-model="ruleForm.yuangongxingming" 
              placeholder="员工姓名" clearable  :readonly="ro.yuangongxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="员工姓名" prop="yuangongxingming">
              <el-input v-model="ruleForm.yuangongxingming" 
                placeholder="员工姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="工号" prop="gonghao">
          <el-input v-model="ruleForm.gonghao" 
              placeholder="工号" clearable  :readonly="ro.gonghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="工号" prop="gonghao">
              <el-input v-model="ruleForm.gonghao" 
                placeholder="工号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="年份" prop="nianfen">
          <el-input v-model="ruleForm.nianfen" 
              placeholder="年份" clearable  :readonly="ro.nianfen"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="年份" prop="nianfen">
              <el-input v-model="ruleForm.nianfen" 
                placeholder="年份" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="月份" prop="yuefen">
          <el-input v-model="ruleForm.yuefen" 
              placeholder="月份" clearable  :readonly="ro.yuefen"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="月份" prop="yuefen">
              <el-input v-model="ruleForm.yuefen" 
                placeholder="月份" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="基本工资" prop="jibengongzi">
          <el-input v-model="ruleForm.jibengongzi" 
              placeholder="基本工资" clearable  :readonly="ro.jibengongzi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="基本工资" prop="jibengongzi">
              <el-input v-model="ruleForm.jibengongzi" 
                placeholder="基本工资" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="提成" prop="ticheng">
          <el-input v-model="ruleForm.ticheng" 
              placeholder="提成" clearable  :readonly="ro.ticheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="提成" prop="ticheng">
              <el-input v-model="ruleForm.ticheng" 
                placeholder="提成" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="补贴" prop="butie">
          <el-input v-model="ruleForm.butie" 
              placeholder="补贴" clearable  :readonly="ro.butie"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="补贴" prop="butie">
              <el-input v-model="ruleForm.butie" 
                placeholder="补贴" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="奖金" prop="jiangjin">
          <el-input v-model="ruleForm.jiangjin" 
              placeholder="奖金" clearable  :readonly="ro.jiangjin"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="奖金" prop="jiangjin">
              <el-input v-model="ruleForm.jiangjin" 
                placeholder="奖金" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="考勤扣款" prop="kaoqinkoukuan">
          <el-input v-model="ruleForm.kaoqinkoukuan" 
              placeholder="考勤扣款" clearable  :readonly="ro.kaoqinkoukuan"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="考勤扣款" prop="kaoqinkoukuan">
              <el-input v-model="ruleForm.kaoqinkoukuan" 
                placeholder="考勤扣款" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="五险一金" prop="wuxianyijin">
          <el-input v-model="ruleForm.wuxianyijin" 
              placeholder="五险一金" clearable  :readonly="ro.wuxianyijin"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="五险一金" prop="wuxianyijin">
              <el-input v-model="ruleForm.wuxianyijin" 
                placeholder="五险一金" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'" label="实发工资" prop="shifagongzi">
            <el-input v-model="shifagongzi"
                placeholder="实发工资" readonly></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.shifagongzi" label="实发工资" prop="shifagongzi">
              <el-input v-model="ruleForm.shifagongzi" 
                placeholder="实发工资" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                                                  <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="人事账号" prop="renshizhanghao">
          <el-input v-model="ruleForm.renshizhanghao" 
              placeholder="人事账号" clearable  :readonly="ro.renshizhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="人事账号" prop="renshizhanghao">
              <el-input v-model="ruleForm.renshizhanghao" 
                placeholder="人事账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming" 
              placeholder="姓名" clearable  :readonly="ro.xingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="姓名" prop="xingming">
              <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                              </el-row>
                                                                                                                                                                                  <el-row>
            <el-col :span="24">
              <el-form-item class="textarea" v-if="type!='info'" label="备注" prop="beizhu">
                <el-input
                  style="min-width: 200px; max-width: 600px;"
                  type="textarea"
                  :rows="8"
                  placeholder="备注"
                  v-model="ruleForm.beizhu" >
                </el-input>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.beizhu" label="备注" prop="beizhu">
                    <span>{{ruleForm.beizhu}}</span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
                                                                                                                                                                                                                                                          <el-form-item class="btn">
                <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    
    
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"#DCDFE6","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"4px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"#606266","addEditBoxColor":"rgba(255, 255, 255, 1)","dateIconFontSize":"14px","btnSaveBgColor":"#409EFF","uploadIconFontColor":"#8c939d","textareaBorderColor":"#DCDFE6","btnCancelBgColor":"#ecf5ff","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"#606266","dateBorderColor":"#DCDFE6","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"4px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"#DCDFE6","inputBorderColor":"#DCDFE6","uploadBorderColor":"#DCDFE6","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"#409EFF","btnSaveBorderWidth":"1px"},
      id: '',
      type: '',
      ro:{
	yuangongxingming : false,
	gonghao : false,
	nianfen : false,
	yuefen : false,
	jibengongzi : false,
	ticheng : false,
	butie : false,
	jiangjin : false,
	kaoqinkoukuan : false,
	wuxianyijin : false,
	shifagongzi : false,
	beizhu : false,
	renshizhanghao : false,
	xingming : false,
      },
            ruleForm: {
                	        yuangongxingming: '',
	                        	        gonghao: '',
	                        	        nianfen: '',
	                        	        yuefen: '',
	                        	        jibengongzi: '',
	                        	        ticheng: '',
	                        	        butie: '',
	                        	        jiangjin: '',
	                        	        kaoqinkoukuan: '',
	                        	        wuxianyijin: '',
	                        	        shifagongzi: '',
	                        	        beizhu: '',
	                        	        renshizhanghao: '',
	                        	        xingming: '',
	                      },
                                                                                                                                                                                                                rules: {
                  yuangongxingming: [
                                    	                                                              ],
                  gonghao: [
                                    	                                                              ],
                  nianfen: [
                                    	                                                              ],
                  yuefen: [
                                    	                                                              ],
                  jibengongzi: [
                                    	                                                              ],
                  ticheng: [
                                    	                                                              ],
                  butie: [
                                    	                                                              ],
                  jiangjin: [
                                    	                                                              ],
                  kaoqinkoukuan: [
                                    	                                                              ],
                  wuxianyijin: [
                                    	                                                              ],
                  shifagongzi: [
                                    	                                                              ],
                  beizhu: [
                                    	                                                              ],
                  renshizhanghao: [
                                    	                                                              ],
                  xingming: [
                                    	                                                              ],
              }
    };
  },
  props: ["parent"],
  computed: {
                                                                                                                                        shifagongzi: {
                                                                                                                                                                                                                                                                                                                                                                                get: function () {
        return 0+parseFloat(this.ruleForm.jibengongzi)+parseFloat(this.ruleForm.ticheng)+parseFloat(this.ruleForm.butie)+parseFloat(this.ruleForm.jiangjin)-this.ruleForm.kaoqinkoukuan-this.ruleForm.wuxianyijin || ''
      }
    },
                                              },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
        // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          	            if(o=='yuangongxingming'){
            this.ruleForm.yuangongxingming = obj[o];
	    this.ro.yuangongxingming = true;
            continue;
          }
	            	            if(o=='gonghao'){
            this.ruleForm.gonghao = obj[o];
	    this.ro.gonghao = true;
            continue;
          }
	            	            if(o=='nianfen'){
            this.ruleForm.nianfen = obj[o];
	    this.ro.nianfen = true;
            continue;
          }
	            	            if(o=='yuefen'){
            this.ruleForm.yuefen = obj[o];
	    this.ro.yuefen = true;
            continue;
          }
	            	            if(o=='jibengongzi'){
            this.ruleForm.jibengongzi = obj[o];
	    this.ro.jibengongzi = true;
            continue;
          }
	            	            if(o=='ticheng'){
            this.ruleForm.ticheng = obj[o];
	    this.ro.ticheng = true;
            continue;
          }
	            	            if(o=='butie'){
            this.ruleForm.butie = obj[o];
	    this.ro.butie = true;
            continue;
          }
	            	            if(o=='jiangjin'){
            this.ruleForm.jiangjin = obj[o];
	    this.ro.jiangjin = true;
            continue;
          }
	            	            if(o=='kaoqinkoukuan'){
            this.ruleForm.kaoqinkoukuan = obj[o];
	    this.ro.kaoqinkoukuan = true;
            continue;
          }
	            	            if(o=='wuxianyijin'){
            this.ruleForm.wuxianyijin = obj[o];
	    this.ro.wuxianyijin = true;
            continue;
          }
	            	            if(o=='shifagongzi'){
            this.ruleForm.shifagongzi = obj[o];
	    this.ro.shifagongzi = true;
            continue;
          }
	            	            if(o=='beizhu'){
            this.ruleForm.beizhu = obj[o];
	    this.ro.beizhu = true;
            continue;
          }
	            	            if(o=='renshizhanghao'){
            this.ruleForm.renshizhanghao = obj[o];
	    this.ro.renshizhanghao = true;
            continue;
          }
	            	            if(o=='xingming'){
            this.ruleForm.xingming = obj[o];
	    this.ro.xingming = true;
            continue;
          }
	                    }
                                                                                                                                                                                                                                              }
            // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
                                                                                                                                                                                                                                                                                              		if(json.renshizhanghao!=''&&json.renshizhanghao){
              		this.ruleForm.renshizhanghao = json.renshizhanghao
		}
                                  		if(json.xingming!=''&&json.xingming){
              		this.ruleForm.xingming = json.xingming
		}
                              } else {
          this.$message.error(data.msg);
        }
      });
                                                                                                                                                                                                                                                                                          },
                                                                                                                        // 多级联动参数
                                                                                                                                                        info(id) {
      this.$http({
        url: `yuangonggongzi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.ruleForm = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });
    },
        // 提交
    onSubmit() {
                  // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
              this.ruleForm.shifagongzi = this.shifagongzi
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                                                                                                                                                                                                                                                                                                this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `yuangonggongzi/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.yuangonggongziCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.yuangonggongziCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
                                                                                                                                                                            	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}
</style>
