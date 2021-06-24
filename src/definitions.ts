export interface ScreenSizePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  getDevicePPI(): Promise<{ ppi: number }>;
  getDeviceDPI(): Promise<{ xdpi: number; ydpi: number }>;
}
