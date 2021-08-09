import { WebPlugin } from '@capacitor/core';

import type { ScreenSizePlugin } from './definitions';

export class ScreenSizeWeb extends WebPlugin implements ScreenSizePlugin {

  async getDevicePPI(): Promise<{ density: number, scaleFactor: number }> {
    console.log('Accessing the PPI is not supported within a browser (web)!');
    return {
      density: 0.0,
      scaleFactor: 1.0
    };
  }

}
