import Foundation
import Capacitor
import DevicePpi

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(ScreenSizePlugin)
public class ScreenSizePlugin: CAPPlugin {
    private let implementation = ScreenSize()

    @objc func getDevicePPI(_ call: CAPPluginCall) {
        let ppi: Double = {
            switch Ppi.get() {
            case .success(let ppi):
                return ppi
            case .unknown(let bestGuessPpi, let error):
                // A bestGuessPpi value is provided but may be incorrect
                // Treat as a non-fatal error -- e.g. log to your backend and/or display a message
                print(error)
                return bestGuessPpi
            }
        }()

        // get native scale factor from iOS device 
        let scale = UIScreen.main.nativeScale


        call.resolve([
            "density": ppi,
            "scaleFactor": scale
        ])
    }
}
