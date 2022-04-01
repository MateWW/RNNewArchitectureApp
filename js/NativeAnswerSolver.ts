import type {TurboModule} from 'react-native';
import {TurboModuleRegistry} from 'react-native';

export interface Spec extends TurboModule {
  syncOne(): number;
  syncTwo(): number;
  asyncOne(): void;
  asyncTwo(): void;
}

export default TurboModuleRegistry.getEnforcing<Spec>('NativeAnswerSolver');
