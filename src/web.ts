import { WebPlugin } from '@capacitor/core';

import type { ScreenSizePlugin } from './definitions';

export class ScreenSizeWeb extends WebPlugin implements ScreenSizePlugin {

  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async getDevicePPI(): Promise<{ ppi: number }> {
    console.log('(web) getDevicePPI:');
    return {
      ppi: 0.0
    };
  }

  async getDeviceDPI(): Promise<{ xdpi: number; ydpi: number }> {
    console.log('(web) getDeviceDPI:');
    return {
      xdpi: 0.0,
      ydpi: 0.0
    }
  }

}
