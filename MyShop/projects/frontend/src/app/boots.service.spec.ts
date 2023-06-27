import { TestBed } from '@angular/core/testing';

import { BootsService } from './boots.service';

describe('BootsService', () => {
  let service: BootsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BootsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
