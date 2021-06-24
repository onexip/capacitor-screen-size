import { WebPlugin } from '@capacitor/core';

import type { ScreenSizePlugin } from './definitions';

export class ScreenSizeWeb extends WebPlugin implements ScreenSizePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
