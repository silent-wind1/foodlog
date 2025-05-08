import request from '@/utils/http.ts'

import type {
  LoginFormData, RegisterFormData,
} from './type'


//定义枚举类统一管理接口
enum API {
  LOGIN_URL = '/api/user/login',
  REGISTER = '/api/user/register',
}

export const reqLogin = (data: LoginFormData) =>
  request.post<any, LoginFormData>(API.LOGIN_URL, data)


export const reqRegister = (data: RegisterFormData) =>
  request.post<any, RegisterFormData>(API.REGISTER, data)
