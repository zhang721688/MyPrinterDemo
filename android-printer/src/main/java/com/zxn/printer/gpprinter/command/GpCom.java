package com.zxn.printer.gpprinter.command;


import com.zxn.printer.gpprinter.utils.GpTools;

public class GpCom
{
  public static final String DEVICE_NAME = "device_name";
  public static final String TOAST = "toast";

  public static String getErrorText(ERROR_CODE errorcode)
  {
    return GpTools.getErrorText(errorcode);
  }
  public static enum ASCII_CONTROL_CODE {
    NUL(0), SOH(1), STX(2), ETX(3), EOT(4), ENQ(5), ACK(6), BEL(7), BS(8), HT(
      9),  LF(10), VT(11), FF(12), CR(13), SO(14), SI(15), DLE(16), DC1(
      17),  DC2(18), DC3(19), DC4(20), NAK(21), SYN(22), ETB(23), CAN(
      24),  EM(25), SUB(26), ESC(27), FS(28), GS(29), RS(30), US(31);

    private final int value;

    private ASCII_CONTROL_CODE(int value) { this.value = value; }

    public byte getASCIIValue()
    {
      return (byte)this.value;
    }
  }

  public static enum DATA_TYPE
  {
    GENERAL, 
    RESERVED1, 
    RESERVED2, 
    DEVICESTATUS, 
    ASB, 
    INKSTATUS, 
    EJ_DATA, 
    NOTHING;
  }

  public static enum ERROR_CODE
  {
    SUCCESS, FAILED, UNDETERMINED, TIMEOUT, NO_DEVICE_PARAMETERS, DEVICE_ALREADY_OPEN, INVALID_PORT_TYPE, INVALID_PORT_NAME, INVALID_PORT_NUMBER, INVALID_IP_ADDRESS, INVALID_IMAGE_FORMAT, INVALID_BIT_DEPTH, INVALID_IMAGE_PROCESSING, INVALID_THRESHOLD, INVALID_DEVICE_STATUS_TYPE, INVALID_SCAN_AREA, INVALID_CROP_AREA, INVALID_CROP_AREA_INDEX, INVALID_PAPER_SIDE, INVALID_FONT, INVALID_JUSTIFICATION, INVALID_PRINT_DIRECTION, INVALID_PRINT_PAGE_MODE, INVALID_CALLBACK_OBJECT, INVALID_PARAMETER_COMBINATION, INVALID_PARAMETER_FOR_CARDSCAN, INVALID_APPLICATION_CONTEXT, NO_USB_DEVICE_FOUND, NO_ACCESS_GRANTED_BY_USER, ERROR_OR_NO_ACCESS_PERMISSION, 
    BLUETOOTH_IS_NOT_SUPPORT, BLUETOOTH_IS_NOT_OPEN, OPEN_BLUETOOTH, NO_STATE_HANDLER;
  }

  public static enum PORT_TYPE
  {
    SERIAL, 
    PARALLEL, 
    USB, 
    ETHERNET, 
    BLUETOOTH;
  }

  static enum RECEIVESTATE
  {
    CHECK_PRINTER, CHECK_POWER;
  }
  static enum RECEIVESUBSTATE {
    RSUBSTATE_INITSTATE, RSUBSTATE_EJDATA, RSUBSTATE_FILEINFO, RSUBSTATE_SIZEINFO, RSUBSTATE_IMAGEDATA, RSUBSTATE_J9100IMAGEDATA;
  }
}