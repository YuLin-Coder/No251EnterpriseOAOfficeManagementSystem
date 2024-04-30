const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmp302b/",
            name: "ssmp302b",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmp302b/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "企业OA办公系统"
        } 
    }
}
export default base
