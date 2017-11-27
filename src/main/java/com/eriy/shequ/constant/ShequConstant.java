package com.eriy.shequ.constant;

/**
 * 错误码
 *
 * @author sunny
 * @create 2017/11/27 14:09
 **/
public interface ShequConstant {
    /** 正常 */
    int SUCCESS = 20000;

    /** 通用：操作失败 */
    int FAILURE = 99998;

    /** 用户未登录 */
    int ERROR_NOT_LOGIN_CODE = 40000;

    /** 参数错误 */
    int ERROR_PARAMETER = 40001;

    /** 权限错误 */
    int ERROR_AUTHORIZATION = 40101;

    /** 认证错误 */
    int ERROR_AUTHENTICATION = 40301;

    /** 页面不存在 */
    int ERROR_PAGE_NOT_FOUND = 40401;

    /** 文件不存在 */
    int ERROR_FILE_NOT_FOUND = 40402;

    /** 请求超时 */
    int ERROR_TIMEOUT = 40801;

    /** 系统错误 */
    int ERROR_SYSTEM = 50000;

    /** 业务错误 */
    int ERROR_BUSINESS = 50001;

    /** 配置错误 */
    int ERROR_CONFIG = 50002;

    /** 网络错误 */
    int ERROR_NETWORK = 50003;

    /** IO错误 */
    int ERROR_IO = 50004;

    /** 网关错误 */
    int ERROR_GATEWAY = 50400;

    /** 支付错误 */
    int ERROR_PAY = 60000;

    /** 支付宝错误 */
    int ERROR_ALIPAY = 60100;

    /** 微信支付错误 */
    int ERROR_WXPAY = 60200;

    /** 空指针错误:NullPointerException */
    int FATAL_NULL_POINTER = 90001;

    /** 计算错误:ArithmeticException */
    int FATAL_ARITHMETIC = 90002;

    /** 类型转换错误:ClassCastException */
    int FATAL_CLASS_CAST = 90003;

    /** 集合负数错误:NegativeArraySizeException */
    int FATAL_NEGATIVE_ARRAY_SIZE = 90004;

    /** 集合超出范围错误:ArrayIndexOutOfBoundsException */
    int FATAL_ARRAY_INDEX_OUT_OF_BOUNDS = 90005;

    /** 文件未找到错误:FileNotFoundException */
    int FATAL_FILE_NOT_FOUND = 90006;

    /** 数字格式错误:NumberFormatException */
    int FATAL_NUMBER_FORMAT = 90007;

    /** SQL错误:SQLException */
    int FATAL_SQL = 90008;

    /** 读写错误:IOException */
    int FATAL_IO = 90009;

    /** 方法未找到错误:NoSuchMethodException */
    int FATAL_NO_SUCH_METHOD = 90010;

    /** 请求方法未找到错误:NoSuchRequestHandlingMethodException */
    int FATAL_NO_SUCH_REQUEST_HANDLING_METHOD = 90011;

    /** 请求方法不支持错误:HttpRequestMethodNotSupportedException */
    int FATAL_HTTP_REQUEST_METHOD_NOT_SUPPORTED = 90012;

    /** 请求类型不支持错误:HttpMediaTypeNotSupportedException */
    int FATAL_HTTP_MEDIA_TYPE_NOT_SUPPORTED = 90013;

    /** 请求类型不接受错误:HttpMediaTypeNotAcceptableException */
    int FATAL_HTTP_MEDIA_TYPE_NOT_ACCEPTABLE = 90014;

    /** 缺失路径变量错误:MissingPathVariableException */
    int FATAL_MISSING_PATH_VARIABLE = 90015;

    /** 缺失Servlet请求参数错误:MissingServletRequestParameterException */
    int FATAL_MISSING_SERVLET_REQUEST_PARAMETER = 90016;

    /** Servlet请求绑定错误:ServletRequestBindingException */
    int FATAL_REQUEST_BINDING = 90017;

    /** 转换不支持错误:ConversionNotSupportedException */
    int FATAL_CONVERSION_NOT_SUPPORTED = 90018;

    /** 类型不匹配错误:TypeMismatchException */
    int FATAL_TYPE_MISMATCH = 90019;

    /** HttpMessage不可读错误:HttpMessageNotReadableException */
    int FATAL_HTTP_MESSAGE_NOT_READABLE = 90020;

    /** HttpMessage不可写错误:HttpMessageNotWritableException */
    int FATAL_HTTP_MESSAGE_NOT_WRITABLE = 90021;

    /** 参数校验无效错误:MethodArgumentNotValidException */
    int FATAL_METHOD_ARGUMENT_NOT_VALID = 90022;

    /** 缺失Servlet请求错误:MissingServletRequestPartException */
    int FATAL_MISSING_SERVLET_REQUEST_PART = 90023;

    /** 绑定错误:BindException */
    int FATAL_BIND = 90024;

    /** 找不到处理器错误:NoHandlerFoundException */
    int FATAL_NO_HANDLER_FOUND = 90025;

    /** 异步请求超时错误:AsyncRequestTimeoutException */
    int FATAL_ASYNC_REQUEST_TIMEOUT = 90026;
}
