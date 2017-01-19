/*****************************************************************************
 *
 * Filename:
 * ---------
 *   camera_sensor_para.h
 *
 * Project:
 * --------
 *   DUMA
 *
 * Description:
 * ------------
 *   Header file of Sensor tuning parameters that should be generated by CCT
 *
 *
 * Author:
 * -------
 *
 *============================================================================
 *             HISTORY
 * Below this line, this part is controlled by CC/CQ. DO NOT MODIFY!!
 *------------------------------------------------------------------------------
 * $Revision:$
 * $Modtime:$
 * $Log:$
 *
 * 04 12 2013 guoqing.liu
 * [ALPS00564761] sensor driver check in
 * sensor driver check in.
 *
 *    mtk70508
 * [DUMA00126076] OV2650 sensor driver check in
 * 
 *
 * Apr 7 2009 mtk02204
 * [DUMA00004012] [Camera] Restructure and rename camera related custom folders and folder name of came
 * 
 *
 * Feb 24 2009 mtk02204
 * [DUMA00001084] First Check in of MT6516 multimedia drivers
 * 
 *
 *------------------------------------------------------------------------------
 * Upper this line, this part is controlled by CC/CQ. DO NOT MODIFY!!
 *============================================================================
 ****************************************************************************/
/* SENSOR FULL SIZE */
#ifndef __CAMERA_SENSOR_PARA_H
#define __CAMERA_SENSOR_PARA_H
		
#define CAMERA_SENSOR_REG_DEFAULT_VALUE  \
		/* ARRAY: SENSOR.reg[11] */\
		{\
			/* STRUCT: SENSOR.reg[0] */\
			{\
				/* SENSOR.reg[0].addr */ 0xFFFFFFFF, /* SENSOR.reg[0].para */ 0xFFFFFFFF\
			},\
			/* STRUCT: SENSOR.reg[1] */\
			{\
				/* SENSOR.reg[1].addr */ 0xFFFFFFFF, /* SENSOR.reg[1].para */ 0xFFFFFFFF\
			},\
			/* STRUCT: SENSOR.reg[2] */\
			{\
				/* SENSOR.reg[2].addr */ 0xFFFFFFFF, /* SENSOR.reg[2].para */ 0xFFFFFFFF\
			},\
			/* STRUCT: SENSOR.reg[3] */\
			{\
				/* SENSOR.reg[3].addr */ 0xFFFFFFFF, /* SENSOR.reg[3].para */ 0xFFFFFFFF\
			},\
			/* STRUCT: SENSOR.reg[4] */\
			{\
				/* SENSOR.reg[4].addr */ 0xFFFFFFFF, /* SENSOR.reg[4].para */ 0xFFFFFFFF\
			},\
			/* STRUCT: SENSOR.reg[5] */\
			{\
				/* SENSOR.reg[5].addr */ 0xFFFFFFFF, /* SENSOR.reg[5].para */ 0xFFFFFFFF\
			},\
			/* STRUCT: SENSOR.reg[6] */\
			{\
				/* SENSOR.reg[6].addr */ 0xFFFFFFFF, /* SENSOR.reg[6].para */ 0xFFFFFFFF\
			},\
			/* STRUCT: SENSOR.reg[7] */\
			{\
				/* SENSOR.reg[7].addr */ 0xFFFFFFFF, /* SENSOR.reg[7].para */ 0xFFFFFFFF\
			},\
			/* STRUCT: SENSOR.reg[8] */\
			{\
				/* SENSOR.reg[8].addr */ 0xFFFFFFFF, /* SENSOR.reg[8].para */ 0xFFFFFFFF\
			},\
			/* STRUCT: SENSOR.reg[9] */\
			{\
				/* SENSOR.reg[9].addr */ 0xFFFFFFFF, /* SENSOR.reg[9].para */ 0xFFFFFFFF\
			},\
			/* STRUCT: SENSOR.reg[10] */\
			{\
				/* SENSOR.reg[10].addr */ 0xFFFFFFFF, /* SENSOR.reg[10].para */ 0xFFFFFFFF\
			}\
		}

//#define CAMERA_SENSOR_CCT_DEFAULT_VALUE {{ 0x0100, 0x0000 },{ 0x0122, 0x0010} ,{ 0x0122, 0x0010 } }

#define CAMERA_SENSOR_CCT_DEFAULT_VALUE {{0x0205,0x1B},{0xffff,0xff}}


#endif /* __CAMERA_SENSOR_PARA_H */
