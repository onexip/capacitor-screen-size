export interface ScreenSizePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  getDevicePPI(): Promise<{ density: string }>;
}
