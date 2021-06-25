import { WebPlugin } from '@capacitor/core';

import type { ScreenSizePlugin } from './definitions';

export class ScreenSizeWeb extends WebPlugin implements ScreenSizePlugin {

  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async getDevicePPI(): Promise<{ density: string }> {
    console.log('(web) getDevicePPI: not implemented for web');
    return {
      density: '0.0'
    };
  }

}
