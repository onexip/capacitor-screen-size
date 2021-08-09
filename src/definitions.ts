export interface ScreenSizePlugin {
  getDevicePPI(): Promise<{ density: number, scaleFactor: number }>;
}
