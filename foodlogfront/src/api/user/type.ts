
// 登录接口需要携带参数ts类型
export interface LoginFormData {
  userAccount?: string
  userPassword?: string
}

// 注册接口
export interface RegisterFormData {
  userAccount?: string
  userPassword?: string
  checkPassword?: string
}



//全部接口返回数据都拥有的ts类型
export interface responseData {
  code: number,
  message: string,
  ok: string
}
