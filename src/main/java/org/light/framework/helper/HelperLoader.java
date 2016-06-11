package org.light.framework.helper;

import org.light.framework.util.ClassUtil;


/**
 * 加载相应的Helper类
 * 
 * @author longjiazuo
 * 
 */
public final class HelperLoader {

	public static void init() {
		Class<?>[] classList = { ClassHelper.class, BeanHelper.class,
				IocHelper.class, ControllerHelper.class };
		for (Class<?> cls : classList) {
			ClassUtil.loadClass(cls.getName(), true);
		}
	}
}