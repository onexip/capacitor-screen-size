# capacitor-screen-size

Get pixel density of iOS and Android devices.
The Android implementation utilizes the DisplayMetrics API to get the density and the native scale.
The iOS implementation uses either a look-up table by ... or an approximated calculation to get the pixel density of the device.

## Install

```bash
npm install capacitor-screen-size
npx cap sync
```

## API

<docgen-index>

* [`getDevicePPI()`](#getdeviceppi)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### getDevicePPI()

```typescript
getDevicePPI() => Promise<{ density: number; scaleFactor: number; identifier: string; tableIdentifier: string; }>
```

**Returns:** <code>Promise&lt;{ density: number; scaleFactor: number; identifier: string; tableIdentifier: string; }&gt;</code>

--------------------

</docgen-api>
