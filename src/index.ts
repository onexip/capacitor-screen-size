import { registerPlugin } from '@capacitor/core';

import type { ScreenSizePlugin } from './definitions';

const ScreenSize = registerPlugin<ScreenSizePlugin>('ScreenSize', {
  web: () => import('./web').then(m => new m.ScreenSizeWeb()),
});

export * from './definitions';
export { ScreenSize };
