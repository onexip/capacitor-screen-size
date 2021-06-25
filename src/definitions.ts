export interface ScreenSizePlugin {
  getDevicePPI(): Promise<{ density: string }>;
}
